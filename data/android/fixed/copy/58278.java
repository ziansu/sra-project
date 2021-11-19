public synchronized boolean rotateShape(int position) {
    if ((stateComponent.activeShapes[position]) == null)
        return false;
    
    return rotateShape(stateComponent.activeShapes[position]);
}