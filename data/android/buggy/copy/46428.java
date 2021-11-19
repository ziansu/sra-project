@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    android.content.Intent intent = new android.content.Intent(getActivity(), de.lespace.apprtc.videocall.DraggableService.class);
    getActivity().bindService(intent, mConnection, Context.BIND_AUTO_CREATE);
}