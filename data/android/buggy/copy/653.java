public int getPoints() {
    int s = size();
    switch (s) {
        case 3 :
            return 50;
        case 4 :
            return 100;
        case 5 :
            return 500;
        default :
            return -1;
    }
}