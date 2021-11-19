@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    if ((dataSnapshot.getChildrenCount()) != 0)
        new io.punchtime.punchtime.ui.fragments.DashboardFragment.LastPulseTask().execute(dataSnapshot);
    
}