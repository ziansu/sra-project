public int getNaturalRandom(int max, int no) {
    int random = no;
    while (random == no) {
        random = getNaturalRandom(max);
    } 
    return random;
}