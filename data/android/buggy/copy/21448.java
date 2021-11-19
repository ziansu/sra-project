@java.lang.Override
public void onProducerEndOfStream() {
    super.onProducerEndOfStream();
    saveChunk();
    io.datakernel.aggregation_db.AggregationChunker.logger.trace("{}: downstream producer {} closed.", this, downstreamProducer);
}