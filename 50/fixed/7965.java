@java.lang.Override
public void onPause() {
    super.onPause();
    savedInstance = new android.os.Bundle();
    onSaveInstanceState(savedInstance);
    handler.removeCallbacks(toggleInputMode);
}