@java.lang.Override
public void onNext(com.jyutwaa.zhaoziliang.glimpse.Model.Bilibili.TopListType topListType) {
    android.widget.Toast.makeText(mContext, "onNext()!", Toast.LENGTH_SHORT).show();
    mIBlibiliFragment.hideProgressbar();
    mIBlibiliFragment.updateList(topListType);
}