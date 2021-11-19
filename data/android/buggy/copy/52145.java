public java.util.List<nl.tudelft.b_b_w.blockchain.Block> getBlocks(nl.tudelft.b_b_w.blockchain.User owner) throws nl.tudelft.b_b_w.model.HashException {
    return blockController.getBlocks(owner.getName());
}