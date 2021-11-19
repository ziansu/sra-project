static void buttonPrev() {
    Player_v2.Buttons.player.stop();
    Player_v2.Buttons.player = new Player_v2.Player();
    Main.dialog.setComboBox1();
    (ChooserOfTrack.num)--;
    Main.trackName = listOfMusic.flacList.get(ChooserOfTrack.num);
    Player_v2.Buttons.player.start();
}