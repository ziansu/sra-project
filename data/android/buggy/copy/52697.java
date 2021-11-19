@java.lang.Override
public void onRefreshBegin(in.srain.cube.views.ptr.PtrFrameLayout frame) {
    getAnswerList();
    android.widget.Toast.makeText(this, "下拉刷新", Toast.LENGTH_SHORT).show();
    mPtrFrame.refreshComplete();
}