@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.graphic_fragment, null);
    initView(view);
    InitUUID(savedInstanceState);
    return view;
}