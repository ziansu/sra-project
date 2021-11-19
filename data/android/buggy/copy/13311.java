private void displayDoors() {
    java.lang.String toPrint = "";
    int index = 1;
    for (cluedo.tile.DoorTile d : room.getDoors()) {
        toPrint += ("[Door " + index) + "]";
    }
    java.lang.System.out.println(toPrint);
}