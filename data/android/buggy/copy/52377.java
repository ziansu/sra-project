protected com.stratelia.webactiv.almanach.control.DisplayableEventOccurrence getADisplaybleEventOccurrenceOf(final com.stratelia.webactiv.almanach.model.EventDetail event) {
    com.stratelia.webactiv.almanach.model.EventOccurrence occurrence = anOccurrenceOf(event, new com.silverpeas.calendar.Date(event.getStartDate()), new com.silverpeas.calendar.Date(event.getEndDate()));
    return com.stratelia.webactiv.almanach.control.DisplayableEventOccurrence.decorate(occurrence);
}