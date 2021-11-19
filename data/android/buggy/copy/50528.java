@java.lang.Override
public void onClick(android.view.View v) {
    org.croudtrip.utils.DataHolder.getInstance().setVehicle_id(0);
    ((it.neokree.materialnavigationdrawer.MaterialNavigationDrawer) (_this.getActivity())).setFragmentChild(new org.croudtrip.fragments.VehicleInfoFragment(), "Add new vehicle");
}