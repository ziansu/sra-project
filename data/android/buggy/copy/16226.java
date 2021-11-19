@java.lang.Override
public void onClick(android.view.View v) {
    editText.clearFocus();
    onChipInteraction(this, translateIdToConst(v));
}