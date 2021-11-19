public void cycleInstance(controller.commands.CycleDirection direction) {
    currentSelection.updateSelectedCommandable(entities.cycleInstance(direction));
    this.notifyStatusObservers();
    java.lang.System.out.println(("current instance " + (entities.getCurrentInstance())));
}