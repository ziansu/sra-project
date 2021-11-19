@org.springframework.context.annotation.Bean
public org.apache.cxf.interceptor.AbstractLoggingInterceptor logInInterceptor() {
    org.apache.cxf.interceptor.LoggingInInterceptor logInInterceptor = new de.jonashackt.tutorial.soapmsglogging.LoggingInInterceptorXmlOnly();
    logInInterceptor.setPrettyLogging(true);
    return logInInterceptor;
}