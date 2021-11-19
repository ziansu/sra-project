public boolean contains(railo.runtime.PageContext pc, java.lang.String name) {
    return (get(getAccess(pc), name, null)) != null;
}