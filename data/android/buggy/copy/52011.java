@java.lang.Override
public void onNext(java.util.List<com.ayuget.redface.data.api.model.Category> categories) {
    android.util.Log.d(com.ayuget.redface.ui.BaseDrawerActivity.LOG_TAG, "onNext loadCategories ===");
    populateNavDrawerCategories(categories);
    onCategoriesLoaded();
}