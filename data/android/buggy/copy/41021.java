public com.rollbar.payload.data.body.Frame code(java.lang.String code) {
    return new com.rollbar.payload.data.body.Frame(filename, lineNumber, columnNumber, method, code, context, args, keywordArgs);
}