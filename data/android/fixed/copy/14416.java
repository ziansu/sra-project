private int getPositionByAddress(com.badlogic.gdx.math.Vector2 cellAddress) {
    for (int i = 0; i < (path.length); i++)
        if (path[i].equals(cellAddress))
            return i;
        
    
    return -1;
}