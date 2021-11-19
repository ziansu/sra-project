private void incrementDisplayTodayBeadCount() {
    (displayTodayBeadCount)++;
    if ((displayTodayBeadCount) == (Constants.BEAD_TO_MALA_RATIO)) {
        displayTodayBeadCount = 0;
    }
}