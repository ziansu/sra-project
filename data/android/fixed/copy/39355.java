@java.lang.Override
public void stopSection(int id) {
    criticalSections.remove(java.lang.Integer.valueOf(id));
    if (criticalSections.isEmpty()) {
        handler.post(executor);
    }
}