@java.lang.Override
public void onResume() {
    super.onResume();
    if (forceUpdate) {
        loadItens();
        updateDataFromServer();
    }else {
        forceUpdate = true;
    }
    verifyEmailStatus();
}