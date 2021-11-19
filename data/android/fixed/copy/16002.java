public void search() {
    final org.xine.xepensees.business.params.entity.QueryParameter parameter = org.xine.xepensees.business.params.entity.QueryParameter.with("name", this.name).page(0, this.pageSize);
    this.currentItens = this.conferenceMng.search(parameter);
}