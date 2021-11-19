public void deduct() {
    if ((inventory) > 0)
        (inventory)--;
    
    if ((infinite) == true)
        refill();
    
}