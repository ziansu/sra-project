private boolean isSameNature(com.lanjing.demo.eventbus.NatureEvent event, int i) {
    return event.getNatureCode().equals(termList.get(i).nature.name());
}