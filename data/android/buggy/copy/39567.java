public void decryptMessage(org.votingsystem.signature.util.AESParams aesParams) throws java.lang.Exception {
    this.aesParams = aesParams;
    decryptedJSON = new org.json.JSONObject(org.votingsystem.signature.util.Encryptor.decryptAES(messageJSON.getString("encryptedMessage"), aesParams));
    loadDecryptedJSON(decryptedJSON);
}