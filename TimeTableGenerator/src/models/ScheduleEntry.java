package models;

public class ScheduleEntry {

    private Course course;
    private Room room;
    private TimeSlot timeSlot;

    public ScheduleEntry(Course course, Room room, TimeSlot timeSlot) {
        this.course = course;
        this.room = room;
        this.timeSlot = timeSlot;
    }

    public Course getCourse() {
        return course;
    }

    public Room getRoom() {
        return room;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    @Override
    public String toString() {
        return "Course: " + course.getCourseName() + " (" + course.getCourseCode() + "), Instructor: " + course.getInstructor().getName() +
                ", Room: " + room.getRoomNumber() + ", Time: " + timeSlot.getDay() + " " + timeSlot.getStartTime() + "-" + timeSlot.getEndTime();
    }
}
