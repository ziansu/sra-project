@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    if ((context) instanceof com.boun.swe.wawwe.MainActivity) {
        com.boun.swe.wawwe.MainActivity main = ((com.boun.swe.wawwe.MainActivity) (context));
        main.getSupportActionBar().show();
    }
}