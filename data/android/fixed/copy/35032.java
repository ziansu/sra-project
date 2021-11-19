@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getData();
    mAdapter = new com.hp.qiushibaike.adapter.QiushiAdapter(mQiushiBriefs);
}