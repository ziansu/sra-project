@java.lang.Override
public void onDestroy() {
    categoryList.clear();
    questionList = null;
    categoryView.clear();
    categoryView = null;
    categoryAdapter = null;
}