@java.lang.Override
public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
    sightings.add(nullSighting);
    current = sightings.get(0);
}