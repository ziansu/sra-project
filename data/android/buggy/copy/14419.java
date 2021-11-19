@java.lang.Override
public void run() {
    java.util.Date minimumEntryDate = be.rla.jtaken.pojos.Creche.get().getMinimumEntryDate();
    textFieldBegin.setText(be.rla.jtaken.helpers.DateHelper.getDate(minimumEntryDate));
    showCalendar();
}