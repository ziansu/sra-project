public static shared.logic.Member BusDriver() {
    return new shared.logic.Member(new shared.roles.Driver().setRoleName(shared.logic.templates.BasicRoles.BUS_DRIVER), shared.logic.support.Constants.A_TOWN).setWeight(shared.logic.templates.BasicRoles.BUSDRIVER_WEIGHT);
}