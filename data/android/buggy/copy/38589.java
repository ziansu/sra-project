@java.lang.Override
public void run() {
    textFieldBegin.setText(be.rla.jtaken.helpers.DateHelper.getDate(be.rla.jtaken.helpers.DateHelper.getFirstOfMonth(be.rla.jtaken.helpers.DateHelper.getNow())));
    showCalendar();
}