protected java.lang.String buildPayload(int version, java.lang.String methodType, java.lang.String data) {
    return (((version + "|") + methodType) + "\n") + data;
}