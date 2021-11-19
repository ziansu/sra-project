public java.lang.String getDate(int i) {
    if (((dateList.size()) < i) || (i < 0)) {
        return null;
    }
    return dateList.get(i);
}