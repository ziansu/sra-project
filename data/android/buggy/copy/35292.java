private static void checkMinuteOffset(int minutes) {
    org.spine3.validate.Validate.checkBounds(minutes, "minutes", org.spine3.time.ZoneOffsets.MIN_MINUTES_OFFSET, org.spine3.time.ZoneOffsets.MAX_MINUTES_OFFSET);
}