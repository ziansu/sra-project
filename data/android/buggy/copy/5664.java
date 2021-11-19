public static dk.dma.ais.message.ShipTypeColor getColor(dk.dma.ais.message.ShipTypeCargo.ShipType type) {
    dk.dma.ais.message.ShipTypeColor c = dk.dma.ais.message.ShipTypeColor.REVERSE_LOOKUP.get(java.util.Objects.requireNonNull(type));
    return c == null ? dk.dma.ais.message.ShipTypeColor.TURQUOISE : c;
}