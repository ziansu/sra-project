@java.lang.Override
public void onDestroy() {
    categoryList.clear();
    questionList = null;
    categoryView.clear();
    categoryAdapter = null;
}