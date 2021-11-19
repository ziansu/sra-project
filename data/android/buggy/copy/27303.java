public com.rollbar.payload.data.body.Frame lineNumber(java.lang.Integer lineNumber) {
    return new com.rollbar.payload.data.body.Frame(filename, lineNumber, columnNumber, method, code, context, args, keywordArgs);
}