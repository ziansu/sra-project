@java.lang.Override
public void onLoadMore() {
    if ((currentPageNumber) < (totalPages)) {
        ++(currentPageNumber);
        fetchRecipes(getView(), false);
    }
}