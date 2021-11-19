@java.lang.Override
public void run() {
    searchThread = null;
    new pt.castro.tops.communication.EndpointSearch().execute(query);
    pt.castro.tops.CustomApplication.getPlacesManager().clear();
}