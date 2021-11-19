public static synchronized void AddNode(com.ntuaece.nikosapos.entities.NodeEntity entity) {
    synchronized(com.ntuaece.nikosapos.entities.NodeEntity.NodeEntityList) {
        com.ntuaece.nikosapos.entities.NodeEntity.NodeEntityList.add(entity);
    }
}