public void loadCategoryFragment() {
    android.support.v4.app.Fragment categoryFragment = new habit.duyle.habit.Fragments.CategoryMainFragment("display");
    replaceFragment(categoryFragment, R.id.category_container);
}