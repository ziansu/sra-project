@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View v = inflater.inflate(R.layout.fragment_parcourt_list_fresque_bd, container, false);
    initParcourt();
    v = initFragment(v);
    return v;
}