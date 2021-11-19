private void MoveDown() {
    int ix = mProperty.x;
    int iy = mProperty.y;
    if (!(isEdge(ix, iy, CRobot.SOUTH)));
    {
        iy--;
    }
    Place(ix, iy, CRobot.SOUTH);
}