public void setEquipment(java.util.ArrayList<io.github.jon_bassi.db.objects.Equipment> equipment) {
    this.equipment = equipment;
    if ((getItemsReturnDate().getTime()) > 0)
        returnDate = getItemsReturnDate();
    
}