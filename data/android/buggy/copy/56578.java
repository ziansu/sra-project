@java.lang.Override
public void delete(com.netbuilder.entities.Product arg0) {
    mongoOperation.remove(arg0);
}