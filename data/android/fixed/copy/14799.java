protected boolean enqueue(malinakis.nlp.syntax_parsers.EarlyMap.EarlyMapEntry entry) {
    if (uniqueSet.contains(entry))
        return false;
    
    queue.add(entry);
    uniqueSet.add(entry);
    return true;
}