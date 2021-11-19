private codemetropolis.toolchain.commons.cmxml.Buildable findRoot(java.util.Collection<codemetropolis.toolchain.commons.cmxml.Buildable> buildables) {
    for (codemetropolis.toolchain.commons.cmxml.Buildable b : buildables)
        if (b.isRoot())
            return b;
        
    
    return null;
}