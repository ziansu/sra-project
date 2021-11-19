private java.lang.String getNext() {
    (position)++;
    if ((position) == ((originalMessage.length()) / 2))
        position = 0;
    
    return positions.get(position);
}