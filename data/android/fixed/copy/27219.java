public static edu.columbia.cs.psl.phosphor.struct.TaintedDoubleWithObjTag ldc$$PHOSPHORTAGGED(edu.columbia.cs.psl.phosphor.runtime.Taint tag, double dou, edu.columbia.cs.psl.phosphor.struct.TaintedDoubleWithObjTag ret) {
    ret.taint = tag;
    ret.val = dou;
    return ret;
}