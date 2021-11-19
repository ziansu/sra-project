@java.lang.Override
public void onScroll(com.comcast.freeflow.core.FreeFlowContainer container, int state) {
    android.util.Log.d(com.comcast.freeflow.examples.artbook.ArtbookActivity.TAG, ("scroll percent " + (container.getScrollPercentY())));
}