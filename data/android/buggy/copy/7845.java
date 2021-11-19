@java.lang.Override
public void onFailure(okhttp3.Call call, java.io.IOException e) {
    e.printStackTrace();
    android.widget.Toast.makeText(this, "错误：根据位置查询城市信息失败。", Toast.LENGTH_LONG).show();
}