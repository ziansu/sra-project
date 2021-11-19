public java.lang.Long save(com.lebao.vo.UserVo vo) {
    com.lebao.po.User user = userConverter.convert2P(vo);
    return userDao.save(user);
}