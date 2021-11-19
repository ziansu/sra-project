public void persist() throws java.lang.Exception {
    removeDeletedSections();
    removeTemplateSection();
    createSectionDefinitionsForNewSections();
    if (createNew) {
        duplicateExistingPlanTemplate();
    }else {
    }
    addSectionsToProposalTemplate();
    updatePlanTemplateTitle();
}