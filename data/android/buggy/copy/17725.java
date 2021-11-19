public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        loadGame();
    } catch (java.lang.Exception e1) {
        e1.printStackTrace();
    }
    java.lang.System.out.println("Game loaded");
}