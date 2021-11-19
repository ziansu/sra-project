@org.junit.Test
public void shouldCreateExcelExportOfThe6thRound() {
    it.fescacom.lambra.service.exporter.Exporter exporter = new it.fescacom.lambra.service.exporter.round.RoundByRoundExporter(collStatsService);
    exporter.export("LambraBLiga.xls", 7);
    org.junit.Assert.assertTrue(new java.io.File("LambraBLiga.xls").exists());
}