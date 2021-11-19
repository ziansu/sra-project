private void setValueInHouses(int value, boolean inHouse) {
    row.setValueInHouse(value, inHouse, this);
    column.setValueInHouse(value, inHouse, this);
    zone.setValueInHouse(value, inHouse, this);
}