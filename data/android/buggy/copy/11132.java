@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    outState.putInt("position", mPairsSpinner.getSelectedItemPosition());
}