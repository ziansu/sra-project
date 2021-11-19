@java.lang.Override
public void execute(org.neo4j.graphdb.GraphDatabaseService service) {
    for (org.neo4j.graphdb.Node n : topologicalOrder(service)) {
        rankDest(n);
    }
}