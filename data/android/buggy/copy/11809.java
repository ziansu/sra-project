public static void main(java.lang.String[] args) {
    new we.software.mastermind.ClientCallServer().start();
    we.software.mastermind.Client player = new we.software.mastermind.Client();
    player.setUsername("Tester");
    new we.software.gui.MainMenu();
}