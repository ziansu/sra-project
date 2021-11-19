@java.lang.Override
public void onClick(android.view.View view) {
    if (vacationMode) {
        confirmOff();
        vacationMode = false;
    }else {
        confirmOn();
        vacationMode = true;
    }
}