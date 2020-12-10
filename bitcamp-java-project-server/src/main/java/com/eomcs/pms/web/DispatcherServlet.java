package com.eomcs.pms.web;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.ibatis.io.Resources;

@MultipartConfig(maxFileSize = 1024 * 1024 * 10)
@WebServlet("/app/*")
public class DispatcherServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;

  Map<String,Controller> controllerMap;

  @SuppressWarnings("unchecked")
  @Override
  public void init() throws ServletException {
    Map<String,Object> beanContainer = 
        (Map<String,Object>)this.getServletContext().getAttribute(name)
    
        beanContainer = 
            (Map<String,Object>)this.getServletContext().getAttribute("beanContainer");
        File path = Resources.getResourceAsFile("com/eomcs/pms/web");

        // => 파일 경로에 URL 인코딩 문자가 들어 있으면 제거한다.
        String decodedFilePath = URLDecoder.decode(path.getCanonicalPath(), "UTF-8");

        // => URL 디코딩된 파일 경로를 가지고 새로 파일 경로를 만든다.
        File controllerPackagePath = new File(decodedFilePath);

        System.out.println(controllerPackagePath.getCanonicalPath());

        // 해당 패키지에 들어 있는 페이지 컨트롤러 클래스를 찾아 인스턴스를 생성한다.
        Map<String,Controller> controllerMap =
            createControllers(controllerPackagePath, "com.eomcs.pms.web");

        // 페이지 컨트롤러 객체만 모아 놓은 상자를
        // ServletContext 보관소에 담는다.
        ctx.setAttribute("controllerMap", controllerMap);

    // 서블릿 객체가 생성될 때 미리
    // ContextLoaderListener 가 준비한 controller map 을
    // ServletContext 에서 꺼낸다.
    controllerMap = (Map<String,Controller>) this.getServletContext().getAttribute(
        "controllerMap");
    catch (Exception e) {
      
    }
  } 

  @Override
  protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    // 예) 요청 URL => /app/board/list
    //String servletPath = request.getServletPath(); // => /app
    String controllerPath = request.getPathInfo(); // => /board/list

    // 페이지 컨트롤러에게 위임한다.
    // => 페이지 컨트롤러 맵에서 클라이언트의 요청을 처리할 객체를 꺼낸다.
    Controller controller = controllerMap.get(controllerPath);
    if (controller == null) {
      System.out.println(controllerPath);
      request.setAttribute("exception", new Exception("요청을 처리할 수 없습니다."));
      request.getRequestDispatcher("/error.jsp").forward(request, response);
      return;
    }

    // => 요청을 처리할 페이지 컨트롤러를 찾았으면 규칙에 따라 메서드를 호출한다.
    try {
      String viewName = controller.execute(request, response);
      if(viewName.startsWith("redirect:")) {
        response.sendRedirect(viewName.substring(9));
        return;
      }
      request.getRequestDispatcher(viewName).forward(request, response);

    } catch (Exception e) {
      request.setAttribute("exception", e);
      request.getRequestDispatcher("/error.jsp").forward(request, response);
    }
  }
}
