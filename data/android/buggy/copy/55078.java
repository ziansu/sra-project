public static void warn(java.lang.Throwable e, java.lang.String format, java.lang.Object... arguments) {
    com.xiaoleilu.hutool.log.LogWrapper.warn(e, com.xiaoleilu.hutool.StrUtil.format(format, arguments));
}