package com.eomcs.pms.service;

import java.util.List;
import java.util.Map;
import com.eomcs.pms.domain.Project;

public interface ProjectService {
  int delete(int no) throws Exception;
  int add(Project project) throws Exception;
  List<Project> list(String keyword) throws Exception;
  // 오버로딩 - 프로그램의 일관성을 위해 같은 이름 부여
  List<Project> list(Map<String, Object> keywords) throws Exception;
  Project get(int no) throws Exception;
  int update(Project project) throws Exception;
  
}
