@org.springframework.context.annotation.Bean
public org.springframework.web.servlet.view.tiles3.TilesConfigurer tilesConfigurer() {
    org.springframework.web.servlet.view.tiles3.TilesConfigurer tiles = new org.springframework.web.servlet.view.tiles3.TilesConfigurer();
    tiles.setDefinitions("/layout/tiles.xml");
    tiles.setCheckRefresh(true);
    return tiles;
}