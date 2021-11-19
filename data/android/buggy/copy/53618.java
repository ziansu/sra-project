public void update() {
    if (!(com.example.yujimomoi.a1daysummerintern.Manager.end_flag))
        this.actionManager.update();
    else
        remove();
    
}