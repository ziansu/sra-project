public com.nhnent.edu.model.Member exists(java.lang.String name, java.lang.String password) {
    com.nhnent.edu.model.Member member = new com.nhnent.edu.model.Member();
    member.setName(name);
    member.setPassword(password);
    return sqlSessionTemplate.selectOne("memberDao.existsMember", member);
}