private static int writeCategory(int cat) {
    switch (cat) {
        case 1 :
        case 2 :
            return 1;
        case 3 :
        case 4 :
            return 2;
        case 5 :
        case 6 :
            return 3;
        default :
            return -1;
    }
}