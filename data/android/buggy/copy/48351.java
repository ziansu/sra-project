public void nextPage() {
    if ((currentPage) < (maxPages)) {
        (currentPage)++;
        this.updateCanvas();
    }
}