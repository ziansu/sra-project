public void delete(final me.corriekay.pokegoutil.utils.ConfigKey configKey) {
    final me.corriekay.pokegoutil.utils.ConfigNew.FindResult res = findNode(configKey.keyName, false);
    res.node().remove(res.name());
}