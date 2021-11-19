private java.lang.String getNext() {
    (position)++;
    if ((position) == ((originalMessage.length()) / 2))
        position = 1;
    
    return positions.get(position);
}