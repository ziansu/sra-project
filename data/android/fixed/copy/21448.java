@java.lang.Override
public void onProducerEndOfStream() {
    saveChunk();
    super.onProducerEndOfStream();
    io.datakernel.aggregation_db.AggregationChunker.logger.trace("{}: downstream producer {} closed.", this, downstreamProducer);
}