protected void ShowErrorToast(java.lang.Exception e) {
    com.sungjae.app.showmethemoney.data.DataMap.writeString(DataMap.ERROR_TOAST_CONTENT, e.getMessage());
}