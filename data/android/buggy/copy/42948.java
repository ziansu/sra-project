public static org.apache.kafka.connect.data.SchemaBuilder builder(int scale) {
    return org.apache.kafka.connect.data.SchemaBuilder.bytes().name(org.apache.kafka.connect.data.Decimal.LOGICAL_NAME).parameter(org.apache.kafka.connect.data.Decimal.SCALE_FIELD, ((java.lang.Integer) (scale)).toString()).version(1);
}