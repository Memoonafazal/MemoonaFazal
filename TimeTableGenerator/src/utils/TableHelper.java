package utils;

import models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TableHelper {
    public void initTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rooms:");
        int numRooms = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        // Create an array of rooms
        Room[] rooms = new Room[numRooms];

        // Get room information from the user
        for (int i = 0; i < numRooms; i++) {
            System.out.println("Enter details for room " + (i + 1) + ":");
            System.out.print("Room Number: ");
            String roomNumber = scanner.nextLine();
            System.out.print("Capacity: ");
            int capacity = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            rooms[i] = new Room(roomNumber, capacity);
        }

        // Display entered rooms
        System.out.println("Entered rooms:");
        for (Room room : rooms) {
            System.out.println(room);
        }

        // List of instructors
        List<Instructor> instructors = new ArrayList<>();
        instructors.add(new Instructor("Dr. John Doe", "I001"));
        instructors.add(new Instructor("Prof. Jane Smith", "I002"));
        instructors.add(new Instructor("Dr. Alice Brown", "I003"));
        instructors.add(new Instructor("Dr. Bob White", "I004"));
        instructors.add(new Instructor("Prof. Carol Green", "I005"));

        // List of courses
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Data Structures", "CS101", instructors.get(0), 3));
        courses.add(new Course("Operating Systems", "CS102", instructors.get(1), 2));
        courses.add(new Course("Algorithms", "CS103", instructors.get(2), 3));
        courses.add(new Course("Database Systems", "CS104", instructors.get(3), 2));
        courses.add(new Course("Software Engineering", "CS105", instructors.get(4), 3));
        courses.add(new Course("Computer Networks", "CS106", instructors.get(0), 2));

        // List of time slots (Monday to Friday)
        List<TimeSlot> timeSlots = new ArrayList<>();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        for (String day : days) {
            timeSlots.add(new TimeSlot(day, "09:00", "12:00"));
            timeSlots.add(new TimeSlot(day, "13:00", "16:00"));
        }

        // Create schedule entries
        Schedule schedule = new Schedule();
        int courseIndex = 0;
        for (TimeSlot timeSlot : timeSlots) {
            for (Room room : rooms) {
                if (courseIndex >= courses.size()) {
                    courseIndex = 0; // Restart from the first course if we run out of courses
                }
                ScheduleEntry entry = new ScheduleEntry(courses.get(courseIndex), room, timeSlot);
                schedule.addEntry(entry);
                courseIndex++;
            }
        }

        // Print the schedule
        System.out.println("Generated Schedule:");
        schedule.printSchedule();

        scanner.close();
    }
}
