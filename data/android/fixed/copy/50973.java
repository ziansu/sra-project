public client.ai.Beetle addBeetle(client.ai.Beetle beetle) {
    client.ai.Beetle beetle1 = beetle.clone();
    beetles.add(beetle1);
    return beetle1;
}