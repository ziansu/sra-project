@java.lang.Override
public int getId(java.lang.String name) {
    return ((getTrait(name)) != null) && (ids.containsKey(getTrait(name))) ? ids.get(getTrait(name)) : null;
}