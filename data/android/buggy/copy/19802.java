protected int factorialCycle(int input) {
    int result = 1;
    while (input > 0) {
        result *= input--;
    } 
    return result;
}