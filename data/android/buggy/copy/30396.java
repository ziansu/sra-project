@java.lang.Override
public void failure(retrofit.RetrofitError retrofitError) {
    java.lang.System.out.println(retrofitError.getLocalizedMessage());
    safeUIBlockingUtility.safelyUnBlockUI();
}