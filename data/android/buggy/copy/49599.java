public void controlTarget(boolean state) {
    int meta = getTargetMetadata();
    if (meta < 0)
        return ;
    
    setTargetMetadata((state ? meta | 8 : meta & 7));
}