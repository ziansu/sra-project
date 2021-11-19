private java.lang.String checkStuRepeat(com.hotmarzz.oa.pojo.Student stu) throws java.lang.Exception {
    com.hotmarzz.oa.pojo.Student s = stuDao.checkStuRepeat(stu);
    if (s != null) {
        return s.getLockUser();
    }else {
        return null;
    }
}