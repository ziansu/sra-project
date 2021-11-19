public PO getByUid(java.lang.String uid) {
    return super.get(br.ufrj.dcc.gerencia.dataaccess.base.CrudLdapDataAccess.query().where("uid").is(uid));
}