private void moveTo(int x, int y) {
    x_dest = x;
    y_dest = y;
    angle = pigeonsquare.utils.Maths.angle(this.x, this.y, x, y);
}