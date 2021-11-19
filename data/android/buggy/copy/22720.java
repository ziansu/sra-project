@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.Toast.makeText(getActivity(), "Calendar - Looking for day", Toast.LENGTH_SHORT).show();
    mLoadingProgress.setVisibility(View.VISIBLE);
    com.sweproject.calorietracker.MainActivity.getDBData(com.sweproject.calorietracker.DataObjects.Days.class, this, "UserId", MainActivity.CurrentUser.Id);
}