public java.util.List<com.level.Position> calculatePlannedRoute(com.level.Position goalPosition) {
    java.util.LinkedList<com.level.Position> points = performAStar();
    java.lang.System.out.println(points);
    return points;
}