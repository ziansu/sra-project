private static synchronized int getNextFakeEntrezId() throws org.mskcc.cbio.portal.dao.DaoException {
    while ((org.mskcc.cbio.portal.dao.DaoGene.getGene(org.mskcc.cbio.portal.dao.DaoGene.fakeEntrezId)) != null) {
        (org.mskcc.cbio.portal.dao.DaoGene.fakeEntrezId)--;
    } 
    return org.mskcc.cbio.portal.dao.DaoGene.fakeEntrezId;
}