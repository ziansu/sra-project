@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    this.tag = ((io.tanners.taggedwallpaper.interfaces.IGetTag) (getActivity())).getTag();
}