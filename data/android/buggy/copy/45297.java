public Floor.Point nextLocation() {
    if (!(path.isEmpty()))
        return path.peek();
    
    return new Floor.Point(1000, 1000);
}