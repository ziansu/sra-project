public void write(int b) throws java.io.IOException {
    if (!(chunk.add(b))) {
        sendChunk();
        (count)++;
        chunk = new com.flightstats.hub.util.Chunk(count);
        chunk.add(b);
    }
}