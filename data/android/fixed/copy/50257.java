private void incrementDisplayTodayBeadCount() {
    (displayTodayBeadCount)++;
    if (((displayTodayBeadCount) > (Constants.BEAD_TO_MALA_RATIO)) && (((displayTodayBeadCount) - 1) == (Constants.BEAD_TO_MALA_RATIO))) {
        displayTodayBeadCount = 1;
    }
}