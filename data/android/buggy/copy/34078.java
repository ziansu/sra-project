public boolean isFiltered(char[] input, int start, int end) {
    if (end >= (input.length))
        return true;
    
    return (input[end]) == (character);
}