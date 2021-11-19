public void init(java.lang.String levelName) {
    this.levelName = levelName;
    switch (levelName) {
        case "test" :
            break;
        case "demo" :
            createDemoMap();
            break;
    }
}