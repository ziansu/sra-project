@java.lang.Override
public void setFillFgColor(java.awt.Color color) {
    if (color != null) {
        poiCellStyle.setFillForegroundColor(((com.dua3.meja.model.poi.PoiWorkbook.PoiHssfWorkbook) (workbook)).getPoiColor(color).getIndex());
    }
}