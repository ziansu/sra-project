@org.junit.Test
public void getAllProcessIntances() {
    java.util.List<com.duggan.workflow.shared.model.ProcessLog> logs = com.duggan.workflow.server.db.DB.getProcessDao().getProcessInstances(null);
    for (com.duggan.workflow.shared.model.ProcessLog log : logs) {
        java.lang.System.out.println(log);
    }
}