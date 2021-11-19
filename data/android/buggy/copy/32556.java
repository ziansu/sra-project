@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    view = inflater.inflate(R.layout.fragment_signup, container, false);
    initializeButtons();
    setcontrolls();
    LoginFacebook();
    return view;
}