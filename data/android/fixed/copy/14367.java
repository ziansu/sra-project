@java.lang.Override
public void onMakeReceivedProcessFinish() {
    android.content.Intent intent = getIntent();
    setResult(humane.vuram.com.humane.organisationgoodsdetail.RESULT_OK, intent);
    hideProgress();
}