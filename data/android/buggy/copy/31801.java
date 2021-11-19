@java.lang.Override
public java.util.Collection<net.ontopia.topicmaps.core.OccurrenceIF> getOccurrences(java.lang.String value) {
    if (value == null)
        throw new java.lang.NullPointerException("Value cannot be null");
    
    return net.ontopia.topicmaps.impl.jdo.utils.JDOQueryUtils.queryToWrappedSet(getQuery(Queries.OCCURRENCEINDEX_OCCURRENCES), topicmap, value);
}