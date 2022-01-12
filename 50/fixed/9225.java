@java.lang.Override
public java.sql.Connection newConnection(java.lang.String address, java.lang.Integer port, java.lang.String name, java.lang.String username, java.lang.String password) {
    return newConnection(type, address, port, name, username, password);
}