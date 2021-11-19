@java.lang.Override
public void run() {
    android.view.View view = mCommentsLayoutManager.findViewByPosition(destPos);
    this.highlightRow(view);
}