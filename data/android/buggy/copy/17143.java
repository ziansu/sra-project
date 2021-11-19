@java.lang.Override
void set(java.lang.Object o, org.osgl.util.ValueObject vo) {
    org.osgl.util.ValueObject.Codec c = findCodec(o.getClass());
    org.osgl.util.E.illegalArgumentIf((null == c), "Cannot find registered codec for value class: %s", o.getClass());
    vo.udf = o;
}