public boolean contains(railo.runtime.PageContext pc, railo.runtime.Key key) {
    return (get(getAccess(pc), key, null)) != null;
}