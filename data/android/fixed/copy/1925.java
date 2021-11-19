public void processVictim(Player p, Landable[][] board) {
    p.setJail(true);
    p.setSquareOn(new int[]{ 10 , 0 }, board);
}