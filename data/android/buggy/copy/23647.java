@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    for (int i = 0; ; i++) {
        rxBus.post(new com.safframework.study.rxbus3.domain.TestBackPressEvent());
    }
}