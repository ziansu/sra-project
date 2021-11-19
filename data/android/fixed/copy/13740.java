@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot dataSnapshot) {
    new io.punchtime.punchtime.ui.fragments.DashboardFragment.LastPulseTask().execute(dataSnapshot);
}