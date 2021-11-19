public void getPingResults() {
    Modules.ReportGenerate.pingResults = Modules.IPPing.run(Modules.ReportGenerate.determinedIP, 30);
}