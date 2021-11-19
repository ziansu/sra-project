public source.Room GetPreviousRoom() {
    if ((rooms.size()) <= 1)
        return null;
    
    return rooms.get(1);
}