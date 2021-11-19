public static org.opensim.view.pub.ViewDB getInstance() {
    if ((org.opensim.view.pub.ViewDB.instance) == null) {
        org.opensim.view.pub.ViewDB.instance = new org.opensim.view.pub.ViewDB();
        org.opensim.view.pub.ViewDB.websocketdb.setObserver(org.opensim.view.pub.ViewDB.instance);
    }
    return org.opensim.view.pub.ViewDB.instance;
}