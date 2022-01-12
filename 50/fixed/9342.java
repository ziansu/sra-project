public void setCode(java.lang.String code) {
    this.code = code;
    this.errorCode = io.minio.ErrorCode.fromString(this.code);
}