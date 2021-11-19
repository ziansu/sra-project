private static float returnDifference(float firstNum, float secNum, int position) {
    float difference = firstNum - secNum;
    int remainder = ((int) (difference % (database.ComparePlayers.differenceNums[position])));
    return 0.01F * remainder;
}