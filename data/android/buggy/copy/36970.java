@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    caldroidFragment.setBackgroundResourceForDate(R.color.caldroid_white, date);
    caldroidFragment.refreshView();
}