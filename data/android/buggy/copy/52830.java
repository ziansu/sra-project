@java.lang.Override
public void onSaveInstanceState(android.os.Bundle savedInstanceState) {
    android.util.Log.d("Ziolle", ("onCreateView: " + (mSelectedPosition)));
    savedInstanceState.putInt(com.example.android.sunshine.app.ForecastFragment.LIST_POSITION, mSelectedPosition);
    super.onSaveInstanceState(savedInstanceState);
}