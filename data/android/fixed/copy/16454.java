public int getBlockChainHeight() {
    if ((allTalkers.size()) == 0) {
        return blockHeight;
    }else
        if ((blockHeight) > (blockChainHeight)) {
            return blockHeight;
        }else {
            return blockChainHeight;
        }
    
}