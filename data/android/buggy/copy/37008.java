public long toMegaByte(long s) {
    return s / ((org.zstack.utils.data.SizeUnit.m) / (org.zstack.utils.data.SizeUnit.b));
}