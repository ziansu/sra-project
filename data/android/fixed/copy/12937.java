public static long timeStampToDayStart(long timeStamp) {
    return moe.haruue.goodhabits.util.TimeUtils.getTimeStampOf(moe.haruue.goodhabits.util.TimeUtils.getDayStartOf(moe.haruue.goodhabits.util.TimeUtils.timeStampToCalendar(timeStamp)));
}