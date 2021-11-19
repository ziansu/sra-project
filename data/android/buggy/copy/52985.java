@java.lang.Override
public void delete(org.elasticsoftware.elasticactors.ShardKey shardKey, org.elasticsoftware.elasticactors.cluster.ActorSystemEvent event, org.elasticsoftware.elasticactors.ActorRef listenerId) {
    cassandraSession.execute(deleteStatement.bind(listenerId.getActorId(), clusterName, shardKey.toString(), event.name()));
}