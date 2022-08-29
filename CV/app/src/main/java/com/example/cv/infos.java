package com.example.cv;

public class infos {

    private String name;
    private int age;
    private String job;
    private int num;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public infos(String name, int age, String job, int num, String email) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.num = num;
        this.email = email;
    }


}
