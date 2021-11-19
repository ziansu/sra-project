public void removePWMlistener(de.yadrone.base.navdata.PWMlistener pwmlistener) {
    this.pwmlistener.remove(pwmlistener);
    setMask(((this.pwmlistener.size()) == 0), new int[]{ de.yadrone.base.navdata.NavDataManager.PWM_TAG });
}