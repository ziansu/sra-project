public synchronized boolean moveShapeRight(int position) {
    if ((stateComponent.activeShapes[position]) == null)
        return false;
    
    boolean retVar = moveShape(1, 0, stateComponent.activeShapes[position]);
    if (retVar)
        putActiveShapeGhosts();
    
    return retVar;
}