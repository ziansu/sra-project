@java.lang.Override
public boolean isClosed() {
    return (super.isClosed()) || (connection.getSession().isClosed());
}