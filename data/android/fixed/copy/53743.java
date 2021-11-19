@java.lang.Override
public void onInputGiven(java.lang.String number) {
    co.snagapp.android.model.Sms sms = new co.snagapp.android.model.Sms();
    sms.setId(number);
    numbers.add(sms);
    dataPersister.addNumberToBlockedNumbers(number);
    onBackPressed();
}