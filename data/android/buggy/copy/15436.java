@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_welcome_step2, null);
    butterknife.ButterKnife.inject(this, v);
    return v;
}