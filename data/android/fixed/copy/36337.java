@java.lang.Override
public void delete(int vmId) {
    properties.remove(java.lang.Integer.toString(vmId));
    saveToFile();
}