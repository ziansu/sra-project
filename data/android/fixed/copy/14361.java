@java.lang.Override
public T remove(long objId) {
    synchronized(lock) {
        safeCheck();
        if (keyContainer.isEmpty())
            return null;
        
        T tmp = net.vicp.lylab.core.pool.IndexedPool.removeFromContainer(objId);
        return tmp;
    }
}