@java.lang.Override
public void onClick(android.view.View paramView) {
    if ((rescheduleSession(0)) == null) {
        createDialog("Rescheduling failed", "The session cannot be scheduled. Minimize duration or use another location.").show();
    }
    showConference();
    showSession();
}