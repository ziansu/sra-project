@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    savedInstanceState.putInt(com.example.android.sunshine.app.ForecastFragment.LIST_POSITION, mSelectedPosition);
    super.onSaveInstanceState(savedInstanceState);
}