@java.lang.Override
public void onClick(android.view.View v) {
    insideScroller.scrollTo(0, ((insideScroller.getScrollY()) + 250));
    LogHop(hop.time, hop.name);
}