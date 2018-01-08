package com.pedromassango.kotlinparcelize;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by pedromassango on 1/8/18.
 */

public class UserJava implements Parcelable {

    private String username;
    private int age;

    protected UserJava(Parcel in, String username, int age) {
        this.username = username;
        this.age = age;
    }

    protected UserJava(Parcel in) {
        username = in.readString();
        age = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeInt(age);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<UserJava> CREATOR = new Creator<UserJava>() {
        @Override
        public UserJava createFromParcel(Parcel in) {
            return new UserJava(in);
        }

        @Override
        public UserJava[] newArray(int size) {
            return new UserJava[size];
        }
    };

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
