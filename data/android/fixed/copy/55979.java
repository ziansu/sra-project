protected void finalize() {
    if ((_sig) != 0)
        mapperSignalQueryDone(_sig);
    
}