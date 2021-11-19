private void setFormModelObject(org.apache.openmeetings.db.entity.calendar.OmCalendar c, org.apache.wicket.ajax.AjaxRequestTarget target) {
    if (c != null) {
        form.setModelObject(c);
        form.url.setModelObject(c.getHref());
    }
    setButtons(target);
}