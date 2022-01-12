public void rotate(int dir) {
    if ((java.lang.Math.abs(dir)) != 1)
        java.lang.System.out.println("ERROR in Player.rotate. Invalid input");
    
    facing = (((facing) + 4) + dir) % 4;
}