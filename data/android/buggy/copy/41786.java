public void OnePlayer() {
    changePhase(1);
    java.lang.System.out.println("click one player");
    java.lang.Thread t2 = new java.lang.Thread(currentp);
    t2.start();
}