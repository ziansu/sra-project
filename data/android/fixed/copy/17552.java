private int getTimeBonus(int timeLeft) {
    if (timeLeft >= 37) {
        return 200;
    }else
        if (timeLeft >= 25) {
            return 150;
        }else
            if (timeLeft >= 12) {
                return 100;
            }else {
                return 0;
            }
        
    
}