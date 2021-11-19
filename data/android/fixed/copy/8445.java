private void filter(java.lang.String category) {
    logic.logger.log(java.util.logging.Level.INFO, ((todolist.model.NormalCommandHandler.LOGGING_SEARCHING_TASK) + category));
    uiHandler.filter(category);
    uiHandler.sendMessage("Here are your filter results");
}