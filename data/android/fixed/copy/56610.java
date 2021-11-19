@android.support.annotation.Nullable
@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, @android.support.annotation.Nullable
android.view.ViewGroup container, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    if ((binding) == null) {
        binding = android.databinding.DataBindingUtil.inflate(inflater, R.layout.fragment_event_repeat_custom, container, false);
    }
    return binding.getRoot();
}