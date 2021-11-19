@java.lang.Override
public int getViewHorizontalDragRange(android.view.View child) {
    return (mViewWebGuide.getWidth()) | (mViewContent.getWidth());
}