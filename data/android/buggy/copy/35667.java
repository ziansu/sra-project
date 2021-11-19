public static com.example.administrator.leehom.fragment.ThridFragment getInstance(int currentPostion) {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putInt(com.example.administrator.leehom.fragment.ThridFragment.CURRENT_POSITION, currentPostion);
    com.example.administrator.leehom.fragment.ThridFragment thridFragment = new com.example.administrator.leehom.fragment.ThridFragment();
    thridFragment.setArguments(bundle);
    return thridFragment;
}