public void select() {
    menuState.select(this);
    updateControllableCollection();
    reset();
    java.lang.System.out.println(("you updated controllable collection, current instance is " + (getCurrentInstance().toString())));
}