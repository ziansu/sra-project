public void setGeneFusions(java.util.List<gov.nih.nci.pedmatch.model.rule.VariantRule> geneFusionRules) {
    if (geneFusionRules == null)
        return ;
    
    this.geneFusionRules = geneFusionRules;
    for (gov.nih.nci.pedmatch.model.rule.VariantRule variantRule : this.geneFusionRules) {
        variantRule.setType(VariantRule.Type.Fusion);
    }
}