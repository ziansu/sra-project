public com.bao.model.Manager login(com.bao.model.Manager manager) {
    return this.sqlSessionTemplate.selectOne("selectBySelective", manager);
}