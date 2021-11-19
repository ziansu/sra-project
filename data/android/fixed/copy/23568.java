public java.util.LinkedList<edu.mit.kacquah.deckviewer.deckobjects.FlyingObject> getHoverObjects() {
    synchronized(this) {
        return new java.util.LinkedList<edu.mit.kacquah.deckviewer.deckobjects.FlyingObject>(this.hoverObjects);
    }
}