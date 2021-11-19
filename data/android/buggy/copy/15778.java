@java.lang.Override
public void onViewCreated(android.view.View view, @android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    audioVisualization.linkTo(DbmHandler.Factory.newVisualizerHandler(getContext(), 0));
}