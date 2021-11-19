@java.lang.Override
public boolean isActive() {
    java.lang.Byte val = active.get();
    switch (val.intValue()) {
        case 0 :
            return false;
        default :
            return true;
    }
}