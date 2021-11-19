@java.lang.Override
protected void generalServerPort() {
    cfg.setTargetPort(data.getBundle(res.getString(R.string.i2ptunnel_wizard_k_target_port)).getInt(Page.SIMPLE_DATA_KEY));
}