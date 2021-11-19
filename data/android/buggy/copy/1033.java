@java.lang.Override
public int compareTo(@org.jetbrains.annotations.NotNull
final com.hartwig.hmftools.breakpointinspector.Util.Location o) {
    final int comp1 = java.lang.Integer.compare(ReferenceIndex, o.ReferenceIndex);
    if (comp1 == 0)
        return java.lang.Integer.compare(Position, o.Position);
    
    return 0;
}