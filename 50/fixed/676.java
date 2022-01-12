@com.fasterxml.jackson.annotation.JsonCreator
static com.spotify.docker.client.messages.swarm.NodeStatus create(@com.fasterxml.jackson.annotation.JsonProperty(value = "State")
final java.lang.String state, @com.fasterxml.jackson.annotation.JsonProperty(value = "Addr")
final java.lang.String addr) {
    return new com.spotify.docker.client.messages.swarm.AutoValue_NodeStatus(state, addr);
}