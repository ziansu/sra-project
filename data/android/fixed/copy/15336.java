@java.lang.Override
public void run() {
    android.view.View view = mCommentsLayoutManager.findViewByPosition(destPos);
    if (view == null) {
        return ;
    }
    this.highlightRow(view);
}