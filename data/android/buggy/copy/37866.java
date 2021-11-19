private void initSahiBrowser() {
    browser = org.sakuli.loader.BeanLoader.loadBean(org.sakuli.javaDSL.service.SahiInitializingService.class).getBrowser();
    browserProcessName = java.lang.String.valueOf(org.springframework.test.util.ReflectionTestUtils.getField(browser, "browserProcessName"));
}