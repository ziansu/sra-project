public static com.krishagni.catissueplus.core.biospecimen.domain.SpecimenShipmentReceivedEvent createForShipmentItem(com.krishagni.catissueplus.core.administrative.domain.ShipmentItem item) {
    com.krishagni.catissueplus.core.biospecimen.domain.SpecimenShipmentReceivedEvent event = new com.krishagni.catissueplus.core.biospecimen.domain.SpecimenShipmentReceivedEvent(item.getSpecimen());
    event.setId(item.getId());
    return event;
}