public int insertCard(Card toAdd) {
    if ((index) > 12)
        return -1;
    
    if ((index) != 0)
        ++(index);
    
    column[index] = new Card(toAdd);
    return index;
}