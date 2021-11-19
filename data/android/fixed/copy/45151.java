public void add(io.github.dhobern.gbifclient.matrix.Item other) {
    (this.count)++;
    this.total += other.getTotal();
}