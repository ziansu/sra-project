private uk.ac.bbsrc.tgac.miso.core.data.TissueType makeTissueType(long id, java.lang.String alias) {
    uk.ac.bbsrc.tgac.miso.core.data.TissueType tt = new uk.ac.bbsrc.tgac.miso.core.data.impl.TissueTypeImpl();
    tt.setId(id);
    tt.setAlias(alias);
    return tt;
}