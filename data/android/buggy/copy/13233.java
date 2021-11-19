private void getMap() {
    allPoints = database.getPoints();
    for (org.Point p : allPoints) {
        if ((p.getBuilding()) == null) {
            p.getNames().add("BUILDING=campus");
        }
    }
}