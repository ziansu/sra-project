@java.lang.Override
public void categoryChanged(int activePosition) {
    android.util.Log.d(com.shakenbeer.babalex.MainActivity.TAG, ("categoryChanged: " + activePosition));
    categoriesManager.onCategoryChanged(activePosition);
    categoryAdapter.setSelected(activePosition);
    showNextCategoryText();
}