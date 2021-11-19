@java.lang.Override
public java.lang.String property(java.lang.String name) throws java.lang.IllegalArgumentException {
    if ((props) == null)
        return null;
    
    return props.get(name);
}