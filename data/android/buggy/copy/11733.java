@java.lang.Override
protected boolean matchesSafely(java.lang.Long arg0) {
    return (java.lang.Math.abs((arg0 - finishedStoryPoints))) >= ((0.005 * 0.5) * (arg0 + finishedStoryPoints));
}