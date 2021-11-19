public static edu.columbia.cs.psl.phosphor.struct.TaintedLongWithObjTag ldc$$PHOSPHORTAGGED(edu.columbia.cs.psl.phosphor.runtime.Taint tag, long lon, edu.columbia.cs.psl.phosphor.struct.TaintedLongWithObjTag ret) {
    ret.taint = tag;
    ret.val = lon;
    return ret;
}