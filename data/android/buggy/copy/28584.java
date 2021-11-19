public void start() {
    de.privat.ciupka.schedule.controller.GUIController.getInstance();
    propertieHandler = de.privat.ciupka.schedule.logic.schedule.PropertieHandler.getInstance();
    scheduleHandler = new de.privat.ciupka.schedule.logic.schedule.ScheduleHandler();
    loadAllSubjects();
}