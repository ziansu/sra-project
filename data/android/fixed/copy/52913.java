@org.springframework.context.annotation.Bean
public org.compiere.Adempiere adempiere() {
    org.compiere.Adempiere.main(applicationContext);
    final org.compiere.Adempiere adempiere = org.compiere.util.Env.getSingleAdempiereInstance(applicationContext);
    return adempiere;
}