public void sessionCreated(javax.servlet.http.HttpSessionEvent arg0) {
    java.util.ArrayList<classes.question.Abstract.Question> questionList = new java.util.ArrayList<classes.question.Abstract.Question>();
    javax.servlet.http.HttpSession s = arg0.getSession();
    s.setAttribute("MasterUser", null);
    s.setAttribute("QuestionList", questionList);
}