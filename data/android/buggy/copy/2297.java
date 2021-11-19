public void addPWMlistener(de.yadrone.base.navdata.PWMlistener pwmlistener) {
    this.pwmlistener.add(pwmlistener);
    setMask(((this.pwmlistener.size()) == 1), new int[]{ de.yadrone.base.navdata.NavDataManager.PWM_TAG });
}