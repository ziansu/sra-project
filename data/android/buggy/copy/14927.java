public org.dlut.mycloudserver.dal.dataobject.VmDO getVmByMacAddr(java.lang.String vmMacAddr) {
    if (org.apache.commons.lang.StringUtils.isBlank(vmMacAddr)) {
        return null;
    }
    return vmManageMapper.getVmByUuid(vmMacAddr);
}