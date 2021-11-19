public void ungetService(org.osgi.framework.Bundle bundle, org.osgi.framework.ServiceRegistration<S> registration, S service) {
    java.lang.System.out.println(((("Service Factory unregister: " + (bundle.getSymbolicName())) + "--Reg :") + (registration.toString())));
}