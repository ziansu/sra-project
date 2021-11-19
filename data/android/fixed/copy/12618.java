public void move() {
    if ((loc.myPos) == null)
        return ;
    
    org.osmdroid.util.GeoPoint gp = new org.osmdroid.util.GeoPoint(loc.myPos);
    move(gp);
}