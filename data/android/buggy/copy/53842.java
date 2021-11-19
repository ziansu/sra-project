public int length() {
    if ((indices.length) < 1)
        return 0;
    
    return (indices[((indices.length) - 1)]) - (indices[0]);
}