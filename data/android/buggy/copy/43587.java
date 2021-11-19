@java.lang.Override
public void onChildAdded(com.bloodport.fragment.DataSnapshot dataSnapshot, java.lang.String previousChild) {
    requests.add(dataSnapshot.getValue(com.bloodport.model.BloodRequest.class));
    adapter.notifyDataSetChanged();
}