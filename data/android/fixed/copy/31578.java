@java.lang.Override
public void onRefresh() {
    currentPageNumber = 1;
    fetchRecipes(getView(), true);
}