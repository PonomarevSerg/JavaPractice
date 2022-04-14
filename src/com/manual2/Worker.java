package com.manual2;

public class Worker {
    public String name;
    public String post;
    public String email;
    public int phone;
    public int salary;
    public int age;

    public Worker (String _name, String _post, String _email, int _phone, int _salary, int _age) {
        name = _name;
        post = _post;
        email = _email;
        phone = _phone;
        salary = _salary;
        age = _age;
    }
    public void showInfo() {
        System.out.println("Имя: " + name + "; Должность: " + post + "; Email: " + email + "; Телефон: " + phone + "; Зарплата: " + salary + "; Возраст: " + age);
    }
}