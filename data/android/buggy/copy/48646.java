public void setBrickHealth(int clickPower) {
    currentBrickHealth -= clickPower;
    if (clickPower > (currentBrickHealth)) {
        brickHits += currentBrickHealth;
    }else {
        brickHits += clickPower;
    }
    (brickHits)++;
    setBrickButton();
}