@java.lang.Override
public int getSize() {
    if (!(data.isVolumeMode()))
        return 0;
    
    return data.size();
}