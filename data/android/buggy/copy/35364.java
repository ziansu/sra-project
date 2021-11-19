public static void requestShowProfile(java.lang.String friend) {
    chatprogramm.cll.gui.data.Person p = chatprogramm.cll.gui.EventController.getProfile(friend);
    chatprogramm.cll.gui.GUIController.requestProfile(p);
}