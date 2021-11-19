public double getAngle(wslf.geometry.Point point) {
    if (p.equals(point)) {
        return 0;
    }
    wslf.geometry.Vector v2 = new wslf.geometry.Vector(p, point);
    return v.getAngle(v2);
}