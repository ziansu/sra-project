public int getReplacedMeta() {
    if (((replacedState) == null) || ((replacedState.getBlock()) == null))
        return 0;
    
    return replacedState.getBlock().getMetaFromState(replacedState);
}