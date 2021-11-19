public void greetings(org.aspectj.lang.ProceedingJoinPoint joinPoint) {
    try {
        stream.println("hello AOP");
        joinPoint.proceed();
        stream.println("bye bye AOP");
    } catch (java.lang.Throwable e) {
        e.toString();
    }
}