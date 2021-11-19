@java.lang.Override
public int getDDLRecordsCount(long ddlRecordSetId) throws com.liferay.portal.kernel.exception.SystemException {
    checkPermission(getPermissionChecker(), ddlRecordSetId, ActionKeys.VIEW);
    return ddlRecordPersistence.countByRecordSetId(ddlRecordSetId);
}