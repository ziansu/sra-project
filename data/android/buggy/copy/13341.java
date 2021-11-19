public long login(com.bao.model.Manager manager) {
    com.bao.model.Manager managerResult = this.sqlSessionTemplate.selectOne("selectBySelective", manager);
    if (managerResult != null) {
        return managerResult.getId();
    }
    return 0L;
}