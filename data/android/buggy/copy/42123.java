private void notifyListeners() {
    if (!(dataDirty))
        return ;
    
    for (com.hardcoders.csc468.weather.graph.Graph.GraphListener listener : listeners) {
        listener.onGraphChanged(this);
    }
    dataDirty = false;
}