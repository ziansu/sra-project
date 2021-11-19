public long getInitTime() {
    return getLong(R.string.pref_init_time, new java.util.Date().getTime());
}