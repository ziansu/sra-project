private static synchronized int getNextFakeEntrezId() throws org.mskcc.cbio.portal.dao.DaoException {
    while ((org.mskcc.cbio.portal.dao.DaoGene.getGene((--(org.mskcc.cbio.portal.dao.DaoGene.fakeEntrezId)))) != null);
    return org.mskcc.cbio.portal.dao.DaoGene.fakeEntrezId;
}