public static void setSystemVersion(java.lang.String systemVersion) {
    com.cisco.oss.foundation.systemversion.SystemVersionFactory.SYSTEM_VERSION_THREAD_LOCAL.set(systemVersion);
    if (systemVersion != null) {
        org.slf4j.MDC.put("systemVersion", systemVersion);
    }
}