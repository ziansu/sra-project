public boolean isLocal(ibis.constellation.impl.ConstellationIdentifier id) {
    return (((rank) << 32) ^ (id.getId())) == 0;
}