@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    outState.putString(Constants.FILE_NAME, fileName);
}