public void unoccupyRoom() {
    if ((this.occupiedRooms) > 0) {
        (this.occupiedRooms)--;
    }else {
        java.lang.System.out.println("there is no occupied room in this house");
    }
}