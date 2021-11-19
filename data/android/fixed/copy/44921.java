public void setSelectedPrescription(ch.bfh.btx8081.w2015.black.MyMedicationApp.businessLogic.model.Prescription selectedPrescription) {
    if (selectedPrescription == null) {
        prescriptionContext.setPrescription(null);
    }else {
        ch.bfh.btx8081.w2015.black.MyMedicationApp.businessLogic.model.Prescription p = prescriptionRepo.getById(selectedPrescription.getPrescriptionId());
        prescriptionContext.setPrescription(p);
    }
}