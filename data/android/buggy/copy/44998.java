@org.junit.Test(expected = org.adempiere.exceptions.AdempiereException.class)
public void test_NULL_PIItemProduct() {
    final de.metas.handlingunits.model.I_M_HU_PI_Item_Product tuPIItemProduct = null;
    lutuFactory.createLUTUConfiguration(tuPIItemProduct, cuProduct, cuUOM, bpartner, false);
}