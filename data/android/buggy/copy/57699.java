public void onClick(android.view.View v) {
    final android.support.v4.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
    ft.replace(R.id.main_frame, new nudelsquad.nudelcalendar.CreateTaskView(1), "NewFragmentTag");
    ft.commit();
}