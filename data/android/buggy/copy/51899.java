@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    log(sk.fiit.adhunter.activities.AdditionalnfoActivity.TAG, ("failure = " + (error.getMessage())));
    mOwnerSpinner.setVisibility(View.GONE);
}