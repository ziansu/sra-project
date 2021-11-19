@java.lang.Override
public void onClick(android.view.View view) {
    mLoadingProgress.setVisibility(View.VISIBLE);
    com.sweproject.calorietracker.MainActivity.getDBData(com.sweproject.calorietracker.DataObjects.Days.class, this, "UserId", MainActivity.CurrentUser.Id);
}