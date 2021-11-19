public void addDoor(double xPos, double yPos, int width, int height, com.htss.hookshot.math.MathVector vector, java.util.Vector<com.htss.hookshot.game.object.obstacles.WallButton> buttons) {
    com.htss.hookshot.game.object.obstacles.Door door = new com.htss.hookshot.game.object.obstacles.Door(xPos, yPos, width, height, vector, buttons, true);
}