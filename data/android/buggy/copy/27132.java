public static void resetSideContent() {
    Presentation.EventSchedule.EventScheduleController.staticScrollPane.setContent(null);
    Presentation.EventSchedule.EventScheduleController.staticComboNewEvent.getSelectionModel().clearSelection();
}