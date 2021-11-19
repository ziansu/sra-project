public void run() {
    Data.mainAct.getFragmentManager().beginTransaction().replace(R.id.content_frame, new map.minimap.mainActivityComponents.LobbyFragment()).commit();
}