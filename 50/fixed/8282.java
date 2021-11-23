public char getNextChar() {
    if ((currentChar) == '\n') {
        (row)++;
        col = 0;
    }else
        (col)++;
    
    return currentChar;
}