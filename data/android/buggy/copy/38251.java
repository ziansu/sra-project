@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    java.lang.System.out.println("onCreateView");
    return inflater.inflate(R.layout.fragment_add_file, container);
}