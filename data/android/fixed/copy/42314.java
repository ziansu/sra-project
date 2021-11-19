public com.hotelbeds.distribution.hotel_api_sdk.helpers.AvailRoom.AvailRoomBuilder detailed(com.hotelbeds.distribution.hotel_api_sdk.helpers.RoomDetail.GuestType type, int age, java.lang.String name, java.lang.String surname) {
    detail(new com.hotelbeds.distribution.hotel_api_sdk.helpers.RoomDetail(type, age, name, surname, 1));
    return this;
}