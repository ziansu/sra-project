private io.anyway.galaxy.context.support.ServiceExecutePayload parsePayload(io.anyway.galaxy.domain.TransactionInfo transactionInfo) {
    java.lang.String payload = transactionInfo.getPayload();
    return com.alibaba.fastjson.JSON.parseObject(payload, io.anyway.galaxy.context.support.ServiceExecutePayload.class);
}