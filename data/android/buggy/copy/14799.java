protected void enqueue(malinakis.nlp.syntax_parsers.EarlyMap.EarlyMapEntry entry) {
    if ((uniqueSet.contains(entry)) && (!(entry.rule.equals(VALID_RULE))))
        return ;
    
    queue.add(entry);
    uniqueSet.add(entry);
}