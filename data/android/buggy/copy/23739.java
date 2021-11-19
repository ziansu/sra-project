@java.lang.Override
protected int p_getSerializedSize() {
    return (((4 + 2) + (4 * (this.block_ids.length))) + (4 * (this.tuple_offsets.length))) + 4;
}