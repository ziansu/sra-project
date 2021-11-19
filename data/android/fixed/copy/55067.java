@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState.putString(com.valevich.moneytracker.ui.activities.MainActivity.TOOLBAR_TITLE_KEY, java.lang.String.valueOf(getTitle()));
    super.onSaveInstanceState(outState);
}