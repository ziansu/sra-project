@java.lang.Override
public void onRefreshBegin(in.srain.cube.views.ptr.PtrFrameLayout frame) {
    getData();
    mPtrFrame.refreshComplete();
}