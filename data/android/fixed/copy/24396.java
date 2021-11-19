@java.lang.Override
public void run() {
    org.greenrobot.eventbus.EventBus.getDefault().postSticky(new com.appsubaruod.comicviewer.utils.messages.SetImageEvent(pageIndex, file));
    if (storePage) {
        mPageIndex = pageIndex;
        mHistoryOrganizer.addOrReflesh(new com.appsubaruod.comicviewer.viewmodel.HistoryItemViewModel(mTitleName, file, pageIndex));
    }
}