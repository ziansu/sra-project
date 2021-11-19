public double getAngle(wslf.geometry.Point point) {
    wslf.geometry.Vector v2 = new wslf.geometry.Vector(p, point);
    return v.getAngle(v2);
}