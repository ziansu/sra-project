@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if ((rootView) == null)
        rootView = inflater.inflate(R.layout.media_list_view, container, false);
    
    tracks = new java.util.ArrayList<>();
    return rootView;
}