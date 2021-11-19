public void onAttached() {
    this.lastRail = this.rail = findInfo(this.owner, false);
    this.lastRailLogic = this.railLogic = null;
    this.railLogicSnapshotted = false;
}