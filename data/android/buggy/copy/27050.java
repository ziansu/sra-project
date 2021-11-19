public static void error(java.lang.Throwable e, java.lang.String format, java.lang.Object... arguments) {
    com.xiaoleilu.hutool.log.LogWrapper.error(e, com.xiaoleilu.hutool.StrUtil.format(format, arguments));
}