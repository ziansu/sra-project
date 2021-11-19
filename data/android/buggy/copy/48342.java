public void showError(java.lang.String message, java.lang.Exception e) {
    logException(e);
    getDialogs().showError(message, e);
    edu.brandeis.cs.nlp.mae.controller.MaeMainController.logger.error(message);
}