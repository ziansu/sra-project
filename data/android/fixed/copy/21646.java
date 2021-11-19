public void killAPIGetter() {
    ag.cancel(true);
    ag = null;
    setBtnClickable(true);
}