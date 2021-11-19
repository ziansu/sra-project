@com.squareup.otto.Subscribe
public void onAuthFail(cz.kovar.petr.homevoice.bus.events.AuthEvent.Fail event) {
    android.util.Log.v(cz.kovar.petr.homevoice.frontend.FragmentPlan.LOG_TAG, "Auth Failed!");
    clearButtons();
}