@java.lang.Override
public void onLoadMore(boolean direction) {
    if (direction)
        addFuture();
    else
        addPast();
    
}