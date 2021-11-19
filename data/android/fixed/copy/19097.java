public void refreshNamazTimeIfDateChange() {
    mPresentDate = getDate();
    if (!(mPresentDate.equals(getDate()))) {
        setTimesFromDatabase(true);
    }
}