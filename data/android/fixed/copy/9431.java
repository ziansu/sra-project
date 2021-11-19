@java.lang.Override
@io.vertx.codegen.annotations.Nullable
public java.lang.String subtag(int level) {
    ensureHeaderProcessed();
    if (level < (parsedValues.size())) {
        return parsedValues.get(level);
    }
    return null;
}