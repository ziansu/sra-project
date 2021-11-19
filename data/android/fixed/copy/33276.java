@java.lang.Override
public void onStatusError(net.datafans.android.common.data.service.BaseResponse response) {
    android.util.Log.e("statusError", response.toString());
    android.widget.Toast toast = android.widget.Toast.makeText(this, response.getErrorMsg(), Toast.LENGTH_SHORT);
    toast.show();
}