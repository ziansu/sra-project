@java.lang.Override
public com.orientechnologies.orient.core.record.impl.ODocument next() {
    if (hasBeenRead)
        return null;
    
    hasBeenRead = true;
    return odoc;
}