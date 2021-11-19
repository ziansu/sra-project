@java.lang.Override
public java.lang.Object onUpdate(java.lang.Object... objects) {
    this.lastTrackingData = ((com.example.payer.pmscs.entities.databaseobjects.TrackingData) (objects[0]));
    notifyObserver.onUpdate();
    return lastTrackingData;
}