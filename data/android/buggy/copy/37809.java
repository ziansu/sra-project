@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_recipes, container, false);
    butterknife.ButterKnife.bind(view);
    return view;
}