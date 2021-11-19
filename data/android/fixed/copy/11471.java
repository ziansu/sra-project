@java.lang.Override
public java.lang.Object call() {
    return proxyService.waitForResponse(pk.getPath(), new com.smockin.admin.persistence.entity.RestfulMock(pk.getPath(), pk.getMethod(), com.smockin.admin.persistence.enums.RecordStatusEnum.ACTIVE, com.smockin.admin.persistence.enums.MockTypeEnum.PROXY, 3000));
}