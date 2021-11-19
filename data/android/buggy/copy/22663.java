protected int factorialRecursion(int input) {
    if (input == 1) {
        return 1;
    }else {
        return input * (factorialRecursion((--input)));
    }
}