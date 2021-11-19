@java.lang.SuppressWarnings(value = "FloatingPointEquality")
@java.lang.Override
public int compareTo(org.apache.lucene.search.grouping.term.TermMemCollector.FloatInt o) {
    return (floatVal) == (o.floatVal) ? (intVal) - (o.intVal) : ((floatVal) - (o.floatVal)) < 0 ? -1 : 1;
}