@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState, android.os.PersistableBundle outPersistentState) {
    super.onSaveInstanceState(outState, outPersistentState);
    icepick.Icepick.saveInstanceState(this, outState);
}