@org.junit.After
public void tearDown() throws java.lang.Exception {
    graphic.Fenetre f = container.getExistingService(graphic.Fenetre.class);
    if (f != null)
        f.waitUntilExit();
    
    container.destructor();
}