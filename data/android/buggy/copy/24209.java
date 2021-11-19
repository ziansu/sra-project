@java.lang.Override
public int size() {
    if ((com.nextfaze.poweradapters.data.FilterData.getDataObserverCount()) <= 0) {
        return calculateSize();
    }
    return mIndex.size();
}