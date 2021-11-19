private codemetropolis.toolchain.commons.cmxml.Buildable findRoot(java.util.Collection<codemetropolis.toolchain.commons.cmxml.Buildable> buildables) {
    for (codemetropolis.toolchain.commons.cmxml.Buildable b : buildables)
        if ((b.isRoot()) && ((b.getType()) == (codemetropolis.toolchain.commons.cmxml.Buildable.Type.GROUND)))
            return b;
        
    
    return null;
}