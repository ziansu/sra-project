public void moveSearchAgents() {
    java.lang.System.out.println("[moveSearchAgents] move");
    for (int i = 0; i < (reactiveAgents.size()); i++) {
        reactiveAgents.get(i).move();
    }
}