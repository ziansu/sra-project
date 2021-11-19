@java.lang.Override
public void getMessageList(int page) {
    mRxDoHttpClient.getMessageList(1).map(BaseResponse::getData).subscribeOn(io.reactivex.schedulers.Schedulers.io()).observeOn(io.reactivex.android.schedulers.AndroidSchedulers.mainThread()).subscribe(mView::showMessageList);
}