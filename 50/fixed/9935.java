@java.lang.Override
protected at.sw2017xp3.regionalo.model.Product doInBackground(java.lang.Integer... params) {
    try {
        at.sw2017xp3.regionalo.model.Product p = at.sw2017xp3.regionalo.model.Core.getInstance().getProducts().getProduct(params[0]);
        return p;
    } catch (java.lang.Exception e) {
        return null;
    }
}