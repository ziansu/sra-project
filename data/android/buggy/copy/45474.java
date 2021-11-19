public org.openprovenance.prov.model.Key newKey(java.lang.Object o, org.openprovenance.prov.model.QualifiedName type) {
    org.openprovenance.prov.model.Key res = of.createKey();
    res.setType(type);
    res.setValueFromObject(o);
    return res;
}