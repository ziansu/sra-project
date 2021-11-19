@java.lang.Override
public java.util.OptionalInt getAsInt(java.lang.String key) {
    final java.lang.Integer value = ((java.lang.Integer) (config.get(key)));
    return value == null ? java.util.OptionalInt.empty() : java.util.OptionalInt.of(value);
}