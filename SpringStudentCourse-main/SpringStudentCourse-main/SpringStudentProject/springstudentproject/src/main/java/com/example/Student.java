package com.example;

public class Student {

    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }

    public void study() {
        System.out.println("Student studying...");
        if (course != null) {
            course.displayCourse();
        }
    }

}