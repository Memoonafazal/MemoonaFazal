package models;

public class Course {
    private String courseName;
    private String courseCode;
    private Instructor instructor;
    private int duration;

    public Course(String courseName, String courseCode, Instructor instructor, int duration) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
        this.duration = duration;
    }

    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
