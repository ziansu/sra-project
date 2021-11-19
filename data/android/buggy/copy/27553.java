@java.lang.Override
public void onChildRemoved(com.google.firebase.database.DataSnapshot dataSnapshot) {
    com.htnguyen.healthy.model.Category category1 = dataSnapshot.getValue(com.htnguyen.healthy.model.Category.class);
    categoryListRemove.add(category1);
    removeList();
}