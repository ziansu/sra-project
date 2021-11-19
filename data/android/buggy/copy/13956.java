private void refreshWeek(java.util.Calendar today) {
    mCurrentWeek = com.sarangjoshi.rhsmustangs.content.SWeek.getDefaultWeek();
    mCurrentWeek.update(today, mUpdatedDays);
}