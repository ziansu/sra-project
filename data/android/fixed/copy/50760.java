public void setPage(edu.cmu.mat.scores.Page p) {
    page = p;
    page.getSystems().clear();
    initDataArray();
    generate();
}