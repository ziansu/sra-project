public void setY(int newY) {
    deleteGridInstance();
    coord.setY(newY);
    updateGrid();
}