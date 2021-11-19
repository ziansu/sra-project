private void start_element(ca.nines.ise.node.StartNode node) {
    if (INLINE_TAGS.contains(node.getName().toLowerCase()))
        ensure_in_line();
    
}