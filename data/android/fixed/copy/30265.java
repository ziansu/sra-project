public int update(models.Equipment equipment) throws java.sql.SQLException {
    switch (this.equipmentRepository.update(equipment)) {
        case 0 :
            return models.status.EquipmentStatus.NOT_FOUND;
    }
    return models.status.EquipmentStatus.OK;
}