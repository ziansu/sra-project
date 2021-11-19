public void increasePickaxeKnowledgePoint(life.grass.grassknowledge.player.KnowledgeStats stats) {
    stats.increaseKnowledgePoint("PICKAXE", knowledgePoint);
    java.lang.System.out.println(stats.getKnowledgePointString());
}