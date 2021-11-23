@java.lang.Override
public void onClick(android.view.View v) {
    mFScreenEventCallback.setHolder(holder);
    eventCallback.bindHolder(holder, position);
    mXibaListPlayUtil.startFullScreen(url, position, holder.container, eventCallback, mFScreenEventCallback);
}