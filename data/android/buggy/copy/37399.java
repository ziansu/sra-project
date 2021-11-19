private void checkedNotifyObserver() {
    java.lang.System.out.println("--- State changed ---");
    java.lang.System.out.println(this);
    this.setChanged();
    this.notifyObservers(getStateForWebRequest());
    this.clearChanged();
}