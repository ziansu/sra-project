public float sumConsumptionValue() {
    float sum = 0.0F;
    for (by.tarif.web.databuffer.Register register : list) {
        sum += register.getConsumption();
    }
    return sum;
}