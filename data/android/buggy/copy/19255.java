@java.lang.Override
public com.pfchoice.core.entity.MembershipInsurance findById(final java.lang.Integer id) {
    com.pfchoice.core.entity.MembershipInsurance entity = get(id);
    java.lang.System.out.println(("in daoimpl entity.getMbr().getFirstName()" + (entity.getMbr().getFirstName())));
    return entity;
}