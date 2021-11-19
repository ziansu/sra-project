@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    menuSetApplyOrSave(menu, dev.ukanth.ufirewall.Api.isEnabled(this));
    dev.ukanth.ufirewall.Api.updateLanguage(getApplicationContext(), dev.ukanth.ufirewall.util.G.locale());
    return super.onPrepareOptionsMenu(menu);
}