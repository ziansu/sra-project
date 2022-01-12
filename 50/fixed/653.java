public int getPoints() {
    int size = size();
    switch (size) {
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