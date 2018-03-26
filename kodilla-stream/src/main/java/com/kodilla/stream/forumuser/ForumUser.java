package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int ID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postQuantity;

    public ForumUser(final int ID,final String userName,final char sex,final LocalDate birthDate,final int postQuantity) {
        this.ID = ID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postQuantity = postQuantity;
    }

    public int getID() {
        return ID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID=" + ID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postQuantity=" + postQuantity +
                '}';
    }
}
