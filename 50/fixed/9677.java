public java.sql.Time getTime() {
    return new java.sql.Time(((timeToComplete) - (util.TimeUtil.TIME_OFFSET)));
}