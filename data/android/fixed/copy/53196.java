public java.lang.String getLabel(int id) {
    if (!(graph.setCurrent(id)))
        return null;
    
    return graph.getCurrentLabel();
}