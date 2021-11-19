public static edu.columbia.cs.psl.phosphor.struct.TaintedBooleanWithObjTag ldc$$PHOSPHORTAGGED(edu.columbia.cs.psl.phosphor.runtime.Taint tag, boolean boo, com.swe795.flabug.Change c, edu.columbia.cs.psl.phosphor.struct.TaintedBooleanWithObjTag ret) {
    ret.taint = new edu.columbia.cs.psl.phosphor.runtime.Taint<java.lang.String>(c.toString());
    ret.val = boo;
    return ret;
}