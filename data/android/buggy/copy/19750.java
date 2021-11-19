public long getTriggerTime() {
    return java.lang.Math.max(java.lang.System.currentTimeMillis(), ((options.optLong("at", 0)) * 1000));
}