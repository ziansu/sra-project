public static void rendezvousRequest(int pid, double lat, double lng, long time) {
    ecs160.deliveries.API.get_instance()._rendezvousRequest(pid, lat, lng, time);
}