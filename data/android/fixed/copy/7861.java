@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mUm = ((android.os.UserManager) (getSystemService(Context.USER_SERVICE)));
    setHasOptionsMenu(true);
}