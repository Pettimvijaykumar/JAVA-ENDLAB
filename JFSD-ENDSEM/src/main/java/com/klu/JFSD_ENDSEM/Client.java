package com.klu.JFSD_ENDSEM;


import jakarta.persistence.*;

@Entity
@Table(name = "clients")
public class Client 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "age", nullable = false)
    private int age;

    @Column(name = "location")
    private String location;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "mobile", unique = true, nullable = false)
    private String mobile;

    public Client() {}

    public Client(String name, String gender, int age, String location, String email, String mobile) 
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.location = location;
        this.email = email;
        this.mobile = mobile;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() 
    {
        return "Client{id=" + id + 
               ", name='" + name + '\'' + 
               ", gender='" + gender + '\'' + 
               ", age=" + age + 
               ", location='" + location + '\'' + 
               ", email='" + email + '\'' + 
               ", mobile='" + mobile + '\'' + 
               '}';
    }
}
