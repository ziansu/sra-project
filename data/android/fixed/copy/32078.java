protected boolean isRetryable(int codeId) {
    io.grpc.Status.Code code = io.grpc.Status.fromCodeValue(codeId).getCode();
    return retryOptions.isRetryable(code);
}