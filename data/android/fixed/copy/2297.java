public void addPWMlistener(de.yadrone.base.navdata.PWMlistener pwmlistener) {
    this.pwmlistener.add(pwmlistener);
    if ((this.pwmlistener.size()) == 1) {
        setMask(false, new int[]{ de.yadrone.base.navdata.NavDataManager.PWM_TAG });
    }
}