private long getNowUnixTimeUs() {
    if ((elapsedRealtimeOffsetMs) != 0) {
        return ((android.os.SystemClock.elapsedRealtime()) + (elapsedRealtimeOffsetMs)) * 1000;
    }else {
        return (java.lang.System.currentTimeMillis()) * 1000;
    }
}