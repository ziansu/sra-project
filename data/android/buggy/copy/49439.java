public void startNavigation() {
    com.spoiledmilk.ibikecph.map.states.NavigatingState state = ((com.spoiledmilk.ibikecph.map.states.NavigatingState) (activity.changeState(com.spoiledmilk.ibikecph.map.states.NavigatingState.class)));
    state.setRoute(route);
}