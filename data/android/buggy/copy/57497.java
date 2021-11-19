public static boolean isChainWaterOnly(org.biojava.nbio.structure.Chain c) {
    boolean waterOnly = true;
    for (org.biojava.nbio.structure.Group g : c.getAtomGroups()) {
        if (!(g.isWater()))
            waterOnly = false;
        
        break;
    }
    return waterOnly;
}