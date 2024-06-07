package utils;

import models.ScheduleEntry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Schedule {
    private List<ScheduleEntry> entries;

    public Schedule() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(ScheduleEntry entry) {
        entries.add(entry);
    }

    public List<ScheduleEntry> getEntries() {
        return entries;
    }

    public void printSchedule() {
        String format = "| %-20s | %-10s | %-15s | %-10s | %-11s |\n";
        String header = "+----------------------+------------+-----------------+------------+-------------+";
        String titleFormat = "| %-61s |\n";

        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        Map<String, List<ScheduleEntry>> entriesByDay = entries.stream()
                .collect(Collectors.groupingBy(e -> e.getTimeSlot().getDay()));

        for (String day : daysOfWeek) {
            if (entriesByDay.containsKey(day)) {
                System.out.println(header);
                System.out.printf(titleFormat, day);
                System.out.println(header);
                System.out.printf("| %-20s | %-10s | %-15s | %-10s | %-11s |\n",
                        "Course Name", "Course Code", "Instructor", "Room", "Time");
                System.out.println(header);

                for (ScheduleEntry entry : entriesByDay.get(day)) {
                    System.out.printf(format, entry.getCourse().getCourseName(), entry.getCourse().getCourseCode(),
                            entry.getCourse().getInstructor().getName(), entry.getRoom().getRoomNumber(),
                            entry.getTimeSlot().getStartTime() + "-" + entry.getTimeSlot().getEndTime());
                    System.out.println(header);
                }
            }
        }


    }
}
