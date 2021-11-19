@java.lang.Override
public void stop() {
    if ((application.DysMain.UIUpdateService) != null)
        application.DysMain.UIUpdateService.shutdown();
    
}