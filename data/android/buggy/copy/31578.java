@java.lang.Override
public void onRefresh() {
    currentPageNumber = 0;
    fetchRecipes(getView(), true);
}