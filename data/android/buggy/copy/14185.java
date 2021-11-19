@java.lang.Override
public java.lang.String findParameter(java.lang.String name) {
    synchronized(parameters) {
        return parameters.get(name);
    }
}