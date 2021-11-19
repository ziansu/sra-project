@java.lang.Override
public void chunkEncoded(org.jactr.core.chunk.event.ChunkEvent event) {
    checkLinks(event.getSource().getSubsymbolicChunk());
}