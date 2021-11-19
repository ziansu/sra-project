@java.lang.Override
public void run() {
    if ((isEditting) && ((spinnerStates.getSelectedItemPosition()) == 0)) {
        int i = states.indexOf(business.state);
        spinnerStates.setSelection((i + 1));
    }
}