private int windowSpareSpace() {
    int cnt = 0;
    for (int i = 0; i < (windowAvailbility.length); i++) {
        if ((windowAvailbility[i]) == true)
            cnt++;
        
    }
    return cnt;
}