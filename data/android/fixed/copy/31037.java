@java.lang.Override
protected void onDestroy() {
    eu.inmite.apps.smsjizdenka.framework.SL.get(this, eu.inmite.apps.smsjizdenka.framework.services.GlobalHandlerService.class).removeListener(this);
    super.onDestroy();
}