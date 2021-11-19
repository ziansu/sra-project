@java.lang.Override
protected void onRestart() {
    super.onRestart();
    if ((measurementService) == null) {
        doBindService();
    }else {
        initGuiState();
    }
}