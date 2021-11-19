@java.lang.Override
public void run() {
    fragMap = new com.operontech.maroon.frag.FragmentMap();
    fManager.beginTransaction().add(R.id.main_fragment, fragMap).hide(fragMap).commit();
}