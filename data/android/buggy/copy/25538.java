@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    switch (position) {
        case 0 :
            com.vibeosys.rorderapp.fragments.FragmentChefMyServing fragmentChefMyServing = new com.vibeosys.rorderapp.fragments.FragmentChefMyServing();
            return fragmentChefMyServing;
        case 1 :
            com.vibeosys.rorderapp.fragments.FragmentChefPlacedOrder fragmentChefPlacedOrder = new com.vibeosys.rorderapp.fragments.FragmentChefPlacedOrder();
            return fragmentChefPlacedOrder;
        default :
            return null;
    }
}