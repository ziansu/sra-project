int how_many_numbers() {
    int i = 0;
    long checker = 0;
    while (checker <= 4000000) {
        checker = fibonacci(i);
        i++;
    } 
    return i;
}