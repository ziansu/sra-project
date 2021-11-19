public static synchronized void close() {
    if ((net.polybugger.apollot.db.ApolloDbAdapter.sOpenCounter) == 1)
        net.polybugger.apollot.db.ApolloDbAdapter.sDb.close();
    
    if ((net.polybugger.apollot.db.ApolloDbAdapter.sOpenCounter) > 0)
        (net.polybugger.apollot.db.ApolloDbAdapter.sOpenCounter)--;
    
}