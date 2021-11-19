@java.lang.Override
public void start(javafx.stage.Stage primaryStage) throws java.lang.Exception {
    com.limpygnome.parrot.component.urlStream.UrlStreamOverrideService urlStreamOverrideService = new com.limpygnome.parrot.component.urlStream.UrlStreamOverrideService();
    urlStreamOverrideService.enable(webStageInitService.isDevelopmentMode());
    com.limpygnome.parrot.component.ui.WebViewStage stage = new com.limpygnome.parrot.component.ui.WebViewStage(webStageInitService);
    stage.show();
}