private void sendCryptoAmountToRemoteActor(java.lang.String genesisTransaction, com.bitdubai.fermat_api.layer.all_definition.money.CryptoAddress cryptoAddressTo, long amount) throws com.bitdubai.fermat_bch_api.layer.crypto_vault.asset_vault.exceptions.CantSendAssetBitcoinsToUserException {
    java.lang.System.out.println("ASSET DISTRIBUTION sending genesis amount from asset vault");
    assetVaultManager.sendAssetBitcoins(genesisTransaction, cryptoAddressTo, amount);
}