public long getPriceAllBill() {
    long priceAll = 0;
    java.util.List<com.example.huynhthanhnha.myapplication.form.Bill> billList = getListBill();
    for (com.example.huynhthanhnha.myapplication.form.Bill b : billList) {
        priceAll += getPriceTotalOfBill(b);
    }
    return priceAll;
}