private static float returnDifference(float firstNum, float secNum, float differenceNum) {
    float difference = firstNum - secNum;
    int remainder = ((int) (difference % differenceNum));
    return 0.01F * remainder;
}