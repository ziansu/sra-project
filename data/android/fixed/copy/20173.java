@java.lang.Override
protected void udf(org.apache.flink.api.java.tuple.Tuple2<java.lang.Integer, java.lang.Integer> a, org.apache.flink.api.java.tuple.Tuple2<java.lang.Integer, java.lang.Integer> b) {
    out.collectElement(org.apache.flink.api.java.tuple.Tuple2.of(a.f1, b.f1));
}