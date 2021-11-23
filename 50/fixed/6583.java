@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    emitter.onSuccess(dataSnapshot);
    emitter.onComplete();
}