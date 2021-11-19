private com.hotmarzz.oa.pojo.Student checkStuRepeat(com.hotmarzz.oa.pojo.Student stu) throws java.lang.Exception {
    com.hotmarzz.oa.pojo.Student s = stuDao.checkStuRepeat(stu);
    return s;
}