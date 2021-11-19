@java.lang.Override
public void addViewControllers(org.springframework.web.servlet.config.annotation.ViewControllerRegistry registry) {
    registry.addViewController("/403").setViewName("403");
    registry.addViewController("/admin/users/self").setViewName("admin/dashboard/user/self");
}