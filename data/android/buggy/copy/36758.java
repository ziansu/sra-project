public void setParameter(de.uni.freiburg.iig.telematik.sewol.log.filter.ContainsFilter.ContainsFilterParameter parameter) {
    if (parameter.equals(this.parameter)) {
        this.parameter = parameter;
        de.uni.freiburg.iig.telematik.sewol.log.filter.ContainsFilter.setChanged();
        de.uni.freiburg.iig.telematik.sewol.log.filter.ContainsFilter.notifyObservers();
    }
}