private void resetDataStreams() {
    if ((path) != null)
        datastreams.persist(((path) + "/"));
    
    datastreams.reset();
}