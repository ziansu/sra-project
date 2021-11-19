public void save(com.lebao.vo.UserVo vo) {
    com.lebao.po.User user = userConverter.convert2P(vo);
    userDao.save(user);
}