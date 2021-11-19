public static void main(java.lang.String[] args) {
    uk.ac.cam.cstibhotel.otcanalyser.gui.GUI.getInstance();
    uk.ac.cam.cstibhotel.otcanalyser.networklayer.NetworkLayer.initialUpdate();
    uk.ac.cam.cstibhotel.otcanalyser.communicationlayer.CommunicationLayer.registerListener(uk.ac.cam.cstibhotel.otcanalyser.gui.GUI.getInstance());
}