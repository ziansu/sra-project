public static com.sem.btrouble.model.Room getNextRoom() {
    (com.sem.btrouble.model.Model.currentLevel)++;
    if (com.sem.btrouble.model.Model.rooms.hasNext())
        return com.sem.btrouble.model.Model.rooms.next();
    else
        return com.sem.btrouble.model.Model.rooms.roomRestart();
    
}