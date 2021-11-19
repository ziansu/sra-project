@java.lang.Override
public void success(final institutosos.org.br.destinocerto.model.WastePackage wastePackage, retrofit.client.Response response) {
    _package = wastePackage;
    institutosos.org.br.destinocerto.activity.detail.wastepackage.PackageActivity._packages.put(finalBarcode, wastePackage);
    setup();
}