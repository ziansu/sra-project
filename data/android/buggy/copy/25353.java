public static edu.columbia.cs.psl.phosphor.struct.TaintedFloatWithObjTag ldc$$PHOSPHORTAGGED(edu.columbia.cs.psl.phosphor.runtime.Taint tag, float flo, java.lang.String c, edu.columbia.cs.psl.phosphor.struct.TaintedFloatWithObjTag ret) {
    ret.taint = new edu.columbia.cs.psl.phosphor.runtime.Taint<java.lang.String>(c.toString());
    ret.val = flo;
    return ret;
}