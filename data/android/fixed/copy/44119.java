public void addVerifier(com.badlogic.gdx.pay.server.PurchaseVerifier verifier) {
    verifiers.put(verifier.storeName(), verifier);
}