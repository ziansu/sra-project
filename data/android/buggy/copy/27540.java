@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View notificappView = inflater.inflate(R.layout.fragment_notificapptor, container, false);
    butterknife.ButterKnife.bind(this, notificappView);
    notifyMe();
    return notificappView;
}