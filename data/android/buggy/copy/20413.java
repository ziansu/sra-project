@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setRetainInstance(true);
    controller = new com.my.fitness.controller.Controller();
}