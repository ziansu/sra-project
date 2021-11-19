@java.lang.Override
public boolean add(T e) {
    addToFlexoActors(e, flexoRole);
    return super.add(e);
}