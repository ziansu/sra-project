@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    com.mdb.wingit.wingit.modelClasses.Adventure currAdventure = dataSnapshot.getValue(com.mdb.wingit.wingit.modelClasses.Adventure.class);
    if (currAdventure != null) {
        java.util.ArrayList<java.lang.String> pinKeys = currAdventure.getPinKeysList();
        getPinList(pinKeys);
    }
}