public static org.csstudio.alarm.service.internal.IAlarmMessage newAlarmMessage(org.csstudio.dal2.service.IPvAccess<java.lang.String> pvAccess) {
    return new org.csstudio.alarm.service.internal.AlarmMessageDAL2Impl(pvAccess);
}