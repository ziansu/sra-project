@java.lang.Override
public void setActive(boolean active) {
    if (active) {
        this.active.setValue(java.lang.Byte.valueOf("1"));
    }else {
        this.active.setValue(java.lang.Byte.valueOf("0"));
    }
    return ;
}