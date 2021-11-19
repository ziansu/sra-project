public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println("You clicked button5!");
    Game.MainMenu.f.repaint();
    Settings.Settings.chi = !(Settings.Settings.chi);
    Settings.Settings.Changed();
    Game.MainMenu.b5.setText(("Chi: " + (Settings.Settings.chi)));
}