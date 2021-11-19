public void setType(nl.tudelft.pixelperfect.event.EventTypes type) {
    this.type = type;
    this.factory = type.getFactory();
}