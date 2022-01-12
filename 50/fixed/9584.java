public void pageMinus() {
    int page = tableDrawer.getPage();
    if (page > 0) {
        page -= 1;
        tableDrawer.setPage(page);
        setPageBtnState();
        setPageNrToField(page);
        draw();
    }
}