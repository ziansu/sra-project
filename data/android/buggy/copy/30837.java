public com.rollbar.payload.data.body.Frame method(java.lang.String method) {
    return new com.rollbar.payload.data.body.Frame(filename, lineNumber, columnNumber, method, code, context, args, keywordArgs);
}