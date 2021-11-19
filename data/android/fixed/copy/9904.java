public double calcWindowArea() {
    if ((windows) != null) {
        return windows.stream().collect(java.util.stream.Collectors.summingDouble((org.foladesoft.room_walls_renovation.room.Window w) -> w.calcArea()));
    }else {
        return 0;
    }
}