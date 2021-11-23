@java.lang.Override
public boolean performLongClick() {
    return ((mLongListener) != null) && (mLongListener.onLongClick(this));
}