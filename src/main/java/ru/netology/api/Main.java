package ru.netology.api;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.birthday = new FormDate();
        post.birthday.day = "13";
        post.birthday.month = "6";
        post.birthday.year = "1997";
        post.name = "Имя";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

    }
}
