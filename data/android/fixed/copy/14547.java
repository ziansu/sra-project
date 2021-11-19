public void addChar(char c) {
    if (c < 0)
        return ;
    
    if (c == 'a') {
        initialize();
    }else {
        mStringBuffer.append(c);
    }
}