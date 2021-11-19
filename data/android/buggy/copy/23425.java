@com.facebook.react.uimanager.annotations.ReactProp(name = "pageNumber")
public void setPageNumber(com.github.barteksc.pdfviewer.PDFView view, java.lang.Integer pageNum) {
    if (pageNum >= 0) {
        pageNumber = pageNum;
        display(false);
    }
}