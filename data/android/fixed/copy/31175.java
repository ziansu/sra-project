@javax.inject.Inject
public void setNeo(@org.jetbrains.annotations.NotNull
org.neo4j.graphdb.GraphDatabaseService neo) {
    if ((this.neo) != null)
        throw new java.lang.IllegalStateException("Graph DB already set");
    
    this.neo = neo;
}