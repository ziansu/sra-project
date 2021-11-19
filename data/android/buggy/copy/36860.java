@org.springframework.context.annotation.Bean
public org.joinfaces.tomcat.JsfTomcatApplicationListener jsfTomcatApplicationListener() {
    return org.joinfaces.tomcat.JsfTomcatApplicationListener.builder().context(customizer.getContext()).build();
}