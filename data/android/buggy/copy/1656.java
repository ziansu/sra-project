public boolean isGameOver() {
    for (int i = 0; i < (engine.Field.WIDTH); i++)
        if ((fixmatrix[i][1]) != 0)
            return true;
        
    
    return false;
}