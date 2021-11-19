public void setData(eu.transkribus.core.model.beans.TrpTranscriptMetadata md, eu.transkribus.core.model.beans.pagecontent.PcGtsType page) {
    super.setMd(md);
    super.setPageData(page);
    updateMdOnTrpPageType();
}