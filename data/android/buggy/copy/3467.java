@java.lang.Override
public edu.umass.cs.ciir.waltz.postings.extents.Extent get(int index) {
    int off = index / 2;
    return new edu.umass.cs.ciir.waltz.postings.extents.Extent(data.get(off), data.get((off + 1)));
}