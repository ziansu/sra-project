public void onDestroy() {
    if ((count) == 0) {
        insertIntoDataBase(studyTimePassed);
    }
    studyTimer.cancel();
    super.onDestroy();
}