public void add(int addable) {
    stat += addable;
    modelNotifyObservers();
}