@java.lang.Override
public void onDialogCancelClick(android.app.DialogFragment dialog, int positionOfAdapter, java.lang.String kindOfAdapter) {
    ((com.example.myequilator.MainFragment) (getFragment())).noteCardsChoosenAfterCancelDialog(kindOfAdapter, positionOfAdapter);
}