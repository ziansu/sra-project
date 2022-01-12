@java.lang.Override
public boolean mayRepresent(java.lang.Object o) {
    if (o == null) {
        return false;
    }
    return _browserModel.containsObject(o);
}