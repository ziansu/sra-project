public static void ranged(int dx, int dy) {
    Main.currentRoom.enemies.add(new Player_Projectile(((Player.xCoord) + dx), ((Player.yCoord) + dy), dx, dy));
}