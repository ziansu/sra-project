@java.lang.Override
public void onApplicationEvent(org.springframework.context.event.ContextRefreshedEvent arg0) {
    this.locator = org.lexevs.locator.LexEvsServiceLocator.getInstance();
    try {
        lazyLoadMetadata();
    } catch (org.LexGrid.LexBIG.Exceptions.LBParameterException | java.io.IOException e) {
        throw new java.lang.RuntimeException(e);
    }
}