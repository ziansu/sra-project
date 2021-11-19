public ru.rsreu.tracer.utils.Channel generateChannel(ru.rsreu.tracer.utils.Connector connector, boolean isTop, int minChannelCapacity, int maxChannelCapacity) {
    return new ru.rsreu.tracer.utils.Channel(connector, java.util.concurrent.ThreadLocalRandom.current().nextInt(minChannelCapacity, maxChannelCapacity), isTop);
}