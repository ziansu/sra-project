public void recordCurrentTimeLap() {
    java.lang.String currentTimeStr = getFormattedCurrentTime();
    recordedLaps.add(((("Lap " + (recordedLaps.size())) + ": ") + currentTimeStr));
}