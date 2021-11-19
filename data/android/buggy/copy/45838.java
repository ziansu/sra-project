public void addShark(jumpingalien.model.Shark shark) {
    if ((!(hasAsShark(shark))) && (canHaveAsShark(shark)))
        sharks.add(shark);
    
}