@java.lang.Override
protected java.util.Iterator<gov.va.cpe.vpr.m4j.mmap.MVar.MVarKey> iterator() {
    return data.subMap(this.path, false, this.path.append(null), false).keySet().iterator();
}