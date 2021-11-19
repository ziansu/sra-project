@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getQiushiData();
    mAdapter = new com.hp.qiushibaike.adapter.QiushiAdapter(mQiushiBriefs);
}