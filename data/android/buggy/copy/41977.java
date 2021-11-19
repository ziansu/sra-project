@java.lang.Override
public void addViewControllers(org.springframework.web.servlet.config.annotation.ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("index");
    com.shijin.learn.movingdemo.config.WebConfig.LOGGER.trace("addViewControllers...");
}