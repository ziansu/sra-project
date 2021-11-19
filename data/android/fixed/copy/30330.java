public void setEncoding(java.lang.String charset) {
    com.amazonaws.services.kinesis.log4j.helpers.Validator.validate((!(com.amazonaws.services.kinesis.log4j.helpers.Validator.isBlank(charset))), "encoding cannot be blank");
    this.encoding = charset.trim();
}