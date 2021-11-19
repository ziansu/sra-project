private void monitorChildController(com.bluelinelabs.conductor.Controller controller) {
    mChildBackstack.add(controller);
    controller.addLifecycleListener(new com.bluelinelabs.conductor.Controller.LifecycleListener() {
        @java.lang.Override
        public void postDestroy(@android.support.annotation.NonNull
        com.bluelinelabs.conductor.Controller controller) {
            mChildBackstack.remove(controller);
        }
    });
}