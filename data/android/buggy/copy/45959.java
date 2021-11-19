public static synchronized void close() {
    (net.polybugger.apollot.db.ApolloDbAdapter.sOpenCounter)--;
    if ((net.polybugger.apollot.db.ApolloDbAdapter.sOpenCounter) == 0) {
        net.polybugger.apollot.db.ApolloDbAdapter.sDb.close();
    }
}