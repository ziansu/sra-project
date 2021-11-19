public void flip(int down, int right, int colour) {
    if (colour == 1) {
        playField[down][right] = 2;
    }else
        playField[down][right] = 1;
    
}