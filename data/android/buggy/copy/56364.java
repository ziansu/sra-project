public void addToStart(mazeUtil.Location newLocation) {
    mazeUtil.LocationListNode newRoot = new mazeUtil.LocationListNode(newLocation);
    newRoot.next = this.root;
    this.root = newRoot;
}