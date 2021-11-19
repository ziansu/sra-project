public com.ci.group20.util.Coordinate size() {
    if ((cells.length) == 0)
        return new com.ci.group20.util.Coordinate(0, 0);
    
    return new com.ci.group20.util.Coordinate(cells.length, cells[0].length);
}