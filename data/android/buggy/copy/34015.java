public int getSecondNode(int node) {
    if ((getNode1()) == node) {
        return getNode1();
    }else
        if ((getNode2()) == node) {
            return getNode2();
        }
    
    return -1;
}