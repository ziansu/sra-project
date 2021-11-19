@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getActivity()) instanceof io.tanners.taggedwallpaper.interfaces.IGetTag) {
        this.tag = ((io.tanners.taggedwallpaper.interfaces.IGetTag) (getActivity())).getTag();
    }else {
    }
}