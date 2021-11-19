@org.springframework.web.bind.annotation.RequestMapping(value = "log")
public void log() {
    org.yyf.gradleDemo.web.controller.TestController.logger.trace("trace info");
    org.yyf.gradleDemo.web.controller.TestController.logger.debug("debug info");
    org.yyf.gradleDemo.web.controller.TestController.logger.info("info  info");
    org.yyf.gradleDemo.web.controller.TestController.logger.warn("warn info");
    org.yyf.gradleDemo.web.controller.TestController.logger.error("error info");
    org.yyf.gradleDemo.web.controller.TestController.logger.fatal("fatal info");
}