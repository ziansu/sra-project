public int GetScore(int s) {
    if (((isError) || (s < 0)) || (s >= (names.size())))
        return -1;
    
    return scores.get(s);
}