public java.util.Date[] getDate(java.lang.Integer index) {
    if (index > ((getDates().size()) - 1)) {
        return null;
    }
    return dateList.get(index);
}