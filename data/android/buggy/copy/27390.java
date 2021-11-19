@java.lang.Override
public boolean hasMember(orc.values.Field f) {
    return methodMap.containsKey(f.field());
}