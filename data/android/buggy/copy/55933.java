@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    super.onScrolled(recyclerView, dx, dy);
    java.lang.System.out.println("szw onScrolled()");
    rvOther.scrollBy(dx, dy);
}