@java.lang.Override
public boolean delete(int id) {
    checkModificationAllowed(id);
    return (proxy.delete(id)) != 0;
}