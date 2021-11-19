public static android.support.v4.app.Fragment newInstance(java.lang.String shippingName) {
    com.kosbrother.mongmongwoo.fragments.PurchaseFragment4 fragment = new com.kosbrother.mongmongwoo.fragments.PurchaseFragment4();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(com.kosbrother.mongmongwoo.fragments.PurchaseFragment4.ARG_SHIPPING_NAME, shippingName);
    fragment.setArguments(args);
    return fragment;
}