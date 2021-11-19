@java.lang.Override
public void contextInitialized(javax.servlet.ServletContextEvent arg0) {
    java.lang.System.out.println("ServletContextListener started");
    edu.ycp.cs320.acadman.persist.DatabaseProvider.setInstance(new edu.ycp.cs320.acadman.persist.SQLiteDatabase());
    edu.ycp.cs320.acadman.controller.Controller.Setup();
}