@java.lang.Override
public void onSelected(java.lang.String date) {
    if (com.paulz.carinsurance.utils.DateUtil.afterToday(date, false)) {
        data.businessinsdate = date;
        btnEffectiveDate2.setText(date);
    }else {
        com.paulz.carinsurance.utils.AppUtil.showToast(getApplication(), "生效日期必须从明天起");
    }
}