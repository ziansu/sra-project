@java.lang.Override
public void onClick(android.view.View v) {
    android.support.v4.app.DialogFragment a = new ediger.diarynutrition.AddFoodDialog();
    a.setTargetFragment(this, ediger.diarynutrition.Fragments.tabs.FoodTab.REQ_CODE_ADD);
    a.show(getFragmentManager(), "add_dialog");
    getLoaderManager().getLoader(0).forceLoad();
}