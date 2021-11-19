public java.util.Date mostRecent() {
    java.util.Collections.sort(mementos, this);
    return mementos.get(0).getDate();
}