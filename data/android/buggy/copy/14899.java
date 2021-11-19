@java.lang.Override
public void showOnFailure() {
    if ((pagerAdapter.getCount()) == 0) {
        showNoData();
    }else {
        android.widget.Toast.makeText(this, "加载数据失败，请检查您的网络", Toast.LENGTH_SHORT).show();
    }
}