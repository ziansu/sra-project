@java.lang.Override
public void onSuccess(org.cloudcoder.app.shared.model.ProblemAndSubscriptionReceipt[] result) {
    org.cloudcoder.app.shared.model.Problem[] problemList = new org.cloudcoder.app.shared.model.Problem[result.length];
    getSession().add(problemList);
}