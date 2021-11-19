public void setSelectedPrescription(ch.bfh.btx8081.w2015.black.MyMedicationApp.businessLogic.model.Prescription selectedPrescription) {
    ch.bfh.btx8081.w2015.black.MyMedicationApp.businessLogic.model.Prescription p = prescriptionRepo.getById(selectedPrescription.getPrescriptionId());
    prescriptionContext.setPrescription(p);
}