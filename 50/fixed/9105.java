public void bankListCache() {
    bankList = bankMapper.getBankList();
    for (com.paypal.dealbridge.storage.domain.Bank i : bankList) {
        bankNO.put(i.getBankOfficial(), i.getBankName());
    }
}