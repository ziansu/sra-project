private long getNextEventTime() {
    return ((nextSubtitleEventIndex) == (-1)) || ((nextSubtitleEventIndex) >= (subtitle.getEventTimeCount())) ? java.lang.Long.MAX_VALUE : subtitle.getEventTime(nextSubtitleEventIndex);
}