public org.yawlfoundation.yawl.unmarshal.YMetaData getMetaData() {
    org.yawlfoundation.yawl.unmarshal.YMetaData metaData = _specification.getMetaData();
    if (metaData == null) {
        metaData = new org.yawlfoundation.yawl.unmarshal.YMetaData();
        _specification.setMetaData(metaData);
    }
    return metaData;
}