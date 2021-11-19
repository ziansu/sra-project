public void OnePlayer() {
    changePhase(1);
    java.lang.System.out.println("click one player");
    java.lang.Thread t = new java.lang.Thread(currentp);
    t.start();
}