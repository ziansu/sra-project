@java.lang.Override
public void onLayoutInflated(android.support.wearable.view.WatchViewStub stub) {
    android.support.wearable.view.CircledImageView circledImageView = ((android.support.wearable.view.CircledImageView) (stub.findViewById(R.id.circle)));
    circledImageView.showIndeterminateProgress(true);
}