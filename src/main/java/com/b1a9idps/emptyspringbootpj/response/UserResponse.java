package com.b1a9idps.emptyspringbootpj.response;

public final class UserResponse {
    final int id;
    final String name;

    public UserResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
