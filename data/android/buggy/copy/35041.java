@java.lang.Override
public void onAttach(android.content.Context context) {
    super.onAttach(context);
    dagger.android.support.AndroidSupportInjection.inject(this);
}