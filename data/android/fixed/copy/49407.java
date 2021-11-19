public java.util.ArrayList<org.hyan23.ex.pojo.Exam> getAll(java.lang.String userName) {
    java.util.ArrayList<org.hyan23.ex.pojo.Exam> examLst = org.hyan23.ex.service.ExamService.examDao.loadAll(userName);
    java.util.Collections.reverse(examLst);
    return examLst;
}