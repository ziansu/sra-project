@java.lang.Override
public void onClick(android.view.View v) {
    max.sudoku.MainActivity.b = null;
    stopListenerOptions();
    stopListener();
    getValues();
    checkHorizontal();
    checkVertical();
    checkBox();
    startListenerOptions();
    startListener();
}