public void handle(@javax.enterprise.event.Observes
Status status) {
    startProcessByKey("interviewProcess");
    startProcessByKey("financialReport");
    while ((getTaskListAndHandle()) <= 0) {
        HistoryService historyService = processEngine.getHistoryService();
        historyService.createHistoricActivityInstanceQuery();
    } 
}