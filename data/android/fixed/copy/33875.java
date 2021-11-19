public com.github.davidmoten.rx.jdbc.QueryUpdate.Builder batchSize(int size) {
    com.github.davidmoten.util.Preconditions.checkArgument((size > 0), "size must be greater than zero");
    com.github.davidmoten.rx.jdbc.Batch.set(new com.github.davidmoten.rx.jdbc.Batch(size));
    this.batchSize = size;
    return this;
}