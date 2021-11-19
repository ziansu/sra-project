private boolean IsContainSurface(java.util.List<java.lang.String> TargetList, java.lang.String SurfaceID) {
    for (java.lang.String target : TargetList) {
        if (SurfaceID.equals(target))
            return true;
        
    }
    return false;
}