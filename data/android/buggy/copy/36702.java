private void buildHyperValentMolecule(chemia.httpsgithub.comahyoung1.chemia.Element centerAtom, chemia.httpsgithub.comahyoung1.chemia.Element[] attachedAtoms) {
    this.name = new ChemNameBuilder.getName(centerAtom, attachedAtoms);
    this.formula = new chemia.httpsgithub.comahyoung1.chemia.ChemFormulaBuilder(centerAtom.getChemSymbol(), $missing$);
}