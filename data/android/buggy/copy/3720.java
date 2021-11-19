@org.junit.Test
public void testGetSelectedReturnsMap() {
    edu.chl.proximity.Models.Map.Particles.ParticleManager pm = new edu.chl.proximity.Models.Map.Particles.ParticleManager(new edu.chl.proximity.Models.Utils.Settings());
    edu.chl.proximity.Models.MenuModels.MapSelect.MapSelect ms = new edu.chl.proximity.Models.MenuModels.MapSelect.MapSelect(pm);
    org.junit.Assert.assertTrue(((ms.getSelected()) instanceof edu.chl.proximity.Models.Map.Maps.Map));
}