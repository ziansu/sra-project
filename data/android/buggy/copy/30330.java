public void setEncoding(java.lang.String charset) {
    com.amazonaws.services.kinesis.log4j.helpers.Validator.validate((!(com.amazonaws.services.kinesis.log4j.helpers.Validator.isBlank(encoding))), "encoding cannot be blank");
    this.encoding = encoding.trim();
}