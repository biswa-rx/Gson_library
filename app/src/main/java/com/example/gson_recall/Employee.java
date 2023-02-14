package com.example.gson_recall;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {
    public String getmFirstName() {
        return mFirstName;
    }

    @SerializedName("first_name")
    private String mFirstName;
    @SerializedName("age")
    private int mAge;
    @SerializedName("mail")
    private String mMail;
    @SerializedName("address")
    private Address mAddress;
    @SerializedName("family")
    private List<FamilyMember> mFamily;

    public Employee(String firstName, int age, String mail, Address address, List<FamilyMember> family) {
        mFirstName = firstName;
        mAge = age;
        mMail = mail;
        mAddress = address;
        mFamily = family;
    }
}
