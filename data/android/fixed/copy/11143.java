@java.lang.Override
public void init() throws java.lang.Exception {
    try {
        client.startInstance(name, new java.lang.String(adminPw));
    } catch (uk.ac.york.mondo.integration.api.HawkInstanceNotFound ex) {
        client.createInstance(name, new java.lang.String(adminPw));
    }
}