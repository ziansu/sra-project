@java.lang.Override
protected int getPrevLoadingPosition(nuclei.persistence.adapter.PagedList<T> list) {
    if (list == null)
        return 0;
    
    return (list.mMinPageIndex) * (list.mPageSize);
}