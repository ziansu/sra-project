@java.lang.Override
public void beginArray(int size, org.neo4j.kernel.api.index.ArrayType arrayType) {
    builder.append(typeChar(arrayType));
}