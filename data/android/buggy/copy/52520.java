@java.lang.Override
public void onViewCreated(android.view.View view, android.os.Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    if ((savedInstanceState != null) && (savedInstanceState.containsKey(edu.cuhk.bus.RouteListFragment.STATE_ACTIVATED_POSITION))) {
        setActivatedPosition(savedInstanceState.getInt(edu.cuhk.bus.RouteListFragment.STATE_ACTIVATED_POSITION));
    }
}