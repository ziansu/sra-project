public io.minio.ErrorCode getErrorCode() {
    return io.minio.ErrorCode.fromString(this.errorResponse.getCode());
}