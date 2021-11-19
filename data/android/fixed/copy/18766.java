@java.lang.Override
public void onClick(co.snagapp.android.Sms sms) {
    numbers.add(sms);
    dataPersister.addNumberToBlockedNumbers(sms.getId());
    onBackPressed();
}