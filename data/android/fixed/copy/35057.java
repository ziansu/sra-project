void getVisited(int side) {
    visited = true;
    walls[side] = 0;
    update();
}