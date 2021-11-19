private void addInstrumentToLaboratory(vonquark.examproject.enteties.Instrument instrument, vonquark.examproject.enteties.Laboratory laboratory) {
    laboratory.getInstruments().add(instrument);
    mLaboratoryRepo.save(laboratory);
}