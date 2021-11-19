public java.lang.Integer getPopularity() {
    if ((getImageRecords()) != null) {
        return getImageRecords().size();
    }
    return 0;
}