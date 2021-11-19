private void doStuff(nl.sjtek.sjtekcontrol.settings.User user) {
    nl.sjtek.sjtekcontrol.network.ApiHandler.getInstance().masterToggle(new nl.sjtek.sjtekcontrol.network.Arguments().setUseVoice(true).setUser(user));
}