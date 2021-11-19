public void add(int addable) {
    if (addable >= 0) {
        stat += addable;
        modelNotifyObservers();
    }
}