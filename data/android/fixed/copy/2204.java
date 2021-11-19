public void setChildrenzParentId() {
    if ((this.getChildren()) != null) {
        for (java.lang.Object dto : getChildren()) {
            ((com.thoughtworks.lean.sonar.aggreagtedreport.dao.base.BaseDto) (dto)).setParentId(getId());
        }
    }
}