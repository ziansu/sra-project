@org.aspectj.lang.annotation.Before(value = "logPoint()")
public void beforeLog(org.aspectj.lang.JoinPoint joinPoint) {
    logger.info(java.lang.String.format("Call %s with arguments: %s", joinPoint.getSignature().toLongString(), java.util.Arrays.toString(joinPoint.getArgs())));
}