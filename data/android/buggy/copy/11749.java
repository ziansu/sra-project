public int softDelete(int id) throws java.sql.SQLException {
    models.Equipment equipment = this.equipmentRepository.get(id);
    if (e = null) {
        return models.status.EquipmentStatus.NOT_FOUND;
    }
    this.equipmentRepository.softDelete(id);
    return models.status.EquipmentStatus.OK;
}