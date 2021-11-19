public void setObserver(java.util.List<GameObjects.Dot> list) {
    for (GameObjects.Dot d : list) {
        this.deleteObservers();
        this.addObserver(d);
    }
}