public void processVictim(Player p, Landable[][] board) {
    p.setJail(true);
    p.setSquareOn(new int[]{ 0 , 10 }, board);
}