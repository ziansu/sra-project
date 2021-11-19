public static dk.dma.ais.message.ShipTypeColor getColor(dk.dma.ais.message.ShipTypeCargo.ShipType type) {
    final dk.dma.ais.message.ShipTypeColor c = (type == null) ? null : dk.dma.ais.message.ShipTypeColor.REVERSE_LOOKUP.get(type);
    return c == null ? dk.dma.ais.message.ShipTypeColor.TURQUOISE : c;
}