@java.lang.Override
public boolean onInterceptTouchEvent(android.support.v7.widget.RecyclerView rv, android.view.MotionEvent e) {
    int action = e.getAction();
    switch (action) {
        case android.view.MotionEvent.ACTION_MOVE :
            rv.getParent().requestDisallowInterceptTouchEvent(true);
            break;
    }
    return false;
}