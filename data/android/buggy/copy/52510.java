public void putContigID(java.lang.String name, int id) {
    if ((getContigID("M")) != null)
        return ;
    
    tmpContigID.put(name, id);
    contigID.put(name, id);
}