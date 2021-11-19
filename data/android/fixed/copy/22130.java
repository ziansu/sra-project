public static edu.columbia.cs.psl.phosphor.struct.TaintedIntWithObjTag ldc$$PHOSPHORTAGGED(edu.columbia.cs.psl.phosphor.runtime.Taint tag, int in, edu.columbia.cs.psl.phosphor.struct.TaintedIntWithObjTag ret) {
    ret.taint = tag;
    ret.val = in;
    return ret;
}