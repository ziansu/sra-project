java.lang.String fizzBuzzSequence() {
    java.lang.String result = "";
    for (int i = 0; i <= 50; i++) {
        result += (fizzBuzz(i)) + ", ";
    }
    return result;
}