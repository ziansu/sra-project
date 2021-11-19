public boolean accepts(konstructs.api.Block block) {
    return (block.getType().equals(typeId)) && (!(isFull()));
}