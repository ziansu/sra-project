public boolean isLocal(ibis.constellation.impl.ConstellationIdentifier id) {
    return (rank) == ((id.getId()) >> 32);
}