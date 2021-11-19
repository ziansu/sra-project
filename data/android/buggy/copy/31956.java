public int addPoint(com.curriculum.domain.KnowledgePoint knowledgePoint) {
    int num = this.knowledgePointDao.addPoint(knowledgePoint);
    return num;
}