public void updateState(client.GameState st) {
    st.setColorMap(colors);
    for (java.util.function.Consumer<client.GameState> sl : stateListeners) {
        sl.accept(st);
    }
}