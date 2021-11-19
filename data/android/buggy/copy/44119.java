public void addVerifier(com.badlogic.gdx.pay.server.PurchaseVerifier verifier) {
    com.badlogic.gdx.pay.server.PurchaseVerifierManager verifiers;
    put(verifier.storeName(), verifier);
}