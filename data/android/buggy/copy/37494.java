private boolean containsWall(java.util.Stack<cell> line) {
    for (Cell c : line)
        if (c.isWall())
            return true;
        
    
}