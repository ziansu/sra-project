public void delete(me.corriekay.pokegoutil.utils.ConfigKey configKey) {
    me.corriekay.pokegoutil.utils.ConfigNew.FindResult res = findNode(configKey.keyName, false);
    res.node().remove(res.name());
}