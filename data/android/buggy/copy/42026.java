@java.lang.Override
public void onAttach(android.content.Context context) {
    if (iFragment.useEventBus())
        org.simple.eventbus.EventBus.getDefault().register(mFragment);
    
    this.iPresenter = iFragment.obtainPresenter();
    iFragment.setPresenter(iPresenter);
}