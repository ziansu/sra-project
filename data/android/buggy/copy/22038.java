public static final boolean encompassedBetweenTwoSides(float lowerBound, float upperBound, float position, float halfSpan) {
    return com.udacity.gamedev.gigagal.util.Utils.betweenTwoValues(position, (lowerBound + halfSpan), (upperBound - halfSpan));
}