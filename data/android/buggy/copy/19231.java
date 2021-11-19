@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    super.onSaveInstanceState(savedInstanceState);
    savedInstanceState.putString(Constants.SavedInstanceState.Characters.LAST_ITEM_SEARCHED, java.lang.String.valueOf(searchView.getQuery()));
}