public java.util.List<com.sung.hee.shcrowd.model.SHCrowd> crowdListInit(com.sung.hee.shcrowd.model.SHCrowd crowd) {
    return sqlSession.selectList(((ns) + "crowdListInit"), crowd);
}