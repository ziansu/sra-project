public static shared.logic.Member Chauffeur() {
    return new shared.logic.Member(new shared.roles.Driver().setRoleName("Chauffeur"), shared.logic.support.Constants.A_MAFIA).setWeight(shared.logic.templates.BasicRoles.CHAUFFEUR_WEIGHT);
}