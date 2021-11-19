public static edu.columbia.cs.psl.phosphor.struct.TaintedFloatWithObjTag ldc$$PHOSPHORTAGGED(edu.columbia.cs.psl.phosphor.runtime.Taint tag, float flo, edu.columbia.cs.psl.phosphor.struct.TaintedFloatWithObjTag ret) {
    ret.taint = tag;
    ret.val = flo;
    return ret;
}