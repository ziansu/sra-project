protected void setPredecessor(int id) throws java.lang.IllegalArgumentException {
    if (id == (agentID)) {
        throw new java.lang.IllegalArgumentException();
    }else {
        predecessorID = id;
    }
}