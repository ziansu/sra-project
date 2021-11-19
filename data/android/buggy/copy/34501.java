private void sendCryptoAmountToRemoteActor(java.lang.String genesisTransaction, com.bitdubai.fermat_api.layer.all_definition.money.CryptoAddress cryptoAddressTo, java.lang.String genesisBlock) throws com.bitdubai.fermat_bch_api.layer.crypto_vault.asset_vault.exceptions.CantSendAssetBitcoinsToUserException {
    java.lang.System.out.println("ASSET USER REDEMPTION sending genesis amount from asset vault");
    assetVaultManager.sendAssetBitcoins(genesisTransaction, genesisBlock, cryptoAddressTo);
}