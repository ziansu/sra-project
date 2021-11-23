public void stop() throws java.lang.Exception {
    for (java.lang.Long cid : commandMap.keySet())
        deleteCommand(cid);
    
}