public void setPositionPointer(int size, int stride, int offset) {
    if ((vertexPosID) != (-1))
        setVertexPointer(vertexPosID, size, stride, offset);
    
}