@java.lang.Override
protected void onPreExecute() {
    progressDialog = progressDialog.show(context, "Lütfen Bekleyiniz", "Suncuyla bağlantı kuruluyor", true, true);
}