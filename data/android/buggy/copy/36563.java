public void done() {
    com.creativemd.creativecore.transformer.Transformer.transformers.remove(this);
    if ((com.creativemd.creativecore.transformer.Transformer.transformers.size()) == 0)
        com.creativemd.creativecore.transformer.TransformerNames.emptyLists();
    
}