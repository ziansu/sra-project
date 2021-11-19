public void sendScrollMessage(long delayTimeInMills) {
    mHandler.removeMessages(tv.guide.pager.widget.GuideViewPage.SCROLL_WHAT);
    mHandler.sendEmptyMessageDelayed(tv.guide.pager.widget.GuideViewPage.SCROLL_WHAT, delayTimeInMills);
}