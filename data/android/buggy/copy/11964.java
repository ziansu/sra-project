public void searchButtonPressed(java.lang.String text) throws java.io.IOException {
    java.lang.System.out.println("Search button pressed");
    model.handleSearch(text);
    getImageList(model.urlList);
}