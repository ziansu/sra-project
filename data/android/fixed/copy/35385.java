@java.lang.Override
public void setHasStableIds(boolean hasStableIds) {
    if ((decoratedAdapter) != null)
        decoratedAdapter.setHasStableIds(hasStableIds);
    
}