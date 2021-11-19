public void doLoadPrev() {
    (pageIndex)--;
    if ((pageIndex) < 0) {
        pageIndex = 0;
    }
    workitems = null;
}