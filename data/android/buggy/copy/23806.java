@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View view = inflater.inflate(R.layout.fragment_list, container, false);
    timesTxt = ((android.widget.TextView) (view.findViewById(R.id.listTimes)));
    return view;
}