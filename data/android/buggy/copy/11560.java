@java.lang.Override
public void onChildChanged(com.google.firebase.database.DataSnapshot dataSnapshot, java.lang.String s) {
    categoryList.clear();
    com.htnguyen.healthy.model.Category category1 = dataSnapshot.getValue(com.htnguyen.healthy.model.Category.class);
    categoryList.add(category1);
    categoryAdapter.notifyDataSetChanged();
}