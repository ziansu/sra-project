private boolean inUpdateCache(long cid) throws java.io.IOException {
    if ((statusCache.size()) == 0)
        return false;
    
    for (org.apache.hadoop.smart.CommandExecutor.CmdTuple ct : statusCache) {
        if ((ct.cid) == cid)
            return true;
        
    }
    return false;
}