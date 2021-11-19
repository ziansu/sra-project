private void start_element(ca.nines.ise.node.StartNode node) {
    if (INLINE_TAGS.contains(node.getName()))
        ensure_in_line();
    
}