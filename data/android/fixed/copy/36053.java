@org.jetbrains.annotations.Nullable
@java.lang.Override
public java.lang.String property(java.lang.String name, @org.jetbrains.annotations.Nullable
java.lang.String dfltVal) {
    if ((props) == null)
        return null;
    
    java.lang.String res = props.get(name);
    if (res == null)
        return dfltVal;
    else
        return res;
    
}