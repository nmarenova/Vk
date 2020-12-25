package ru.netology.domain;

public class Image {
    int id;
    int authorId;
    String authorName;
    String authorAvatar;
    String authorLink;
    String dateTime;
    String image;
    LikesInfo likesInfo;
    int commentNumber;
    int repostNumber;
    boolean friendsOnly;
    String geoCoordinates;
    String geoPlace;
    boolean isFavorite;
}
