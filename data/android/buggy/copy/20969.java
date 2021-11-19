public static layout.StreamFragment newInstance(java.lang.String value) {
    layout.StreamFragment fragment = new layout.StreamFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putString("key", value);
    fragment.setArguments(args);
    return fragment;
}