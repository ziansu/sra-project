public void setMultiSponsors(java.util.List<java.lang.String> multiSponsors) {
    this.multiSponsors = multiSponsors.stream().map(this::adjustSponsorsWithInitials).collect(java.util.stream.Collectors.toList());
}