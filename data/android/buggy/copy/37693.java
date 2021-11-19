public boolean filter(java.util.List nodes) {
    if (((nodes.size()) - 1) <= (this.maxStops))
        return true;
    
    return false;
}