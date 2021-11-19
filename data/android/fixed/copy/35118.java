public Show findShow(java.lang.String showName) {
    return this.showList.search(new Show(showName, 0, null, null, null));
}