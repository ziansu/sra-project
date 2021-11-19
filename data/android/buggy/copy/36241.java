public int getCurrentVertexID() {
    if ((established_arrivals) > 1) {
        return vertices.get(((established_arrivals) - 1));
    }else
        return 0;
    
}