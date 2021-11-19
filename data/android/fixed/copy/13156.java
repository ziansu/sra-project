@org.springframework.context.annotation.Bean
public java.lang.Boolean initializeData() {
    if (((env) != null) && ((env.getProperty("init")) == null)) {
        return java.lang.Boolean.FALSE;
    }else {
        return java.lang.Boolean.TRUE;
    }
}