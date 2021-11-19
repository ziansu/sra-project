public static synchronized org.eclipse.jubula.client.internal.AUTConnection getInstance() throws org.eclipse.jubula.client.internal.exceptions.ConnectionException {
    if ((org.eclipse.jubula.client.internal.AUTConnection.instance) == null) {
        org.eclipse.jubula.client.internal.AUTConnection.instance = new org.eclipse.jubula.client.internal.AUTConnection(0);
    }
    return org.eclipse.jubula.client.internal.AUTConnection.instance;
}