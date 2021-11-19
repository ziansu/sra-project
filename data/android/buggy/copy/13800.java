public long getStartingTimeIgnoreTimeOfDay() {
    return com.example.brandon.habitlogger.common.MyTimeUtils.setTimePortion(getStartingTime(), false, 0, 0, 0, 0);
}