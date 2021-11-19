protected int binarySearchPageIndex(java.lang.Number number) {
    int i = java.util.Collections.binarySearch(pages, new com.github.zhongl.ex.page.Numbered(number) {    });
    return -(i + 2);
}