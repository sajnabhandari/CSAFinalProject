import java.time.LocalDate;
public class Goal {
private String description;
private LocalDate date;
private boolean completed;
private String reflection;
public Goal(String description, LocalDate date) {
    this.description = description;
    this.date = date;
    this.completed = false;
    this.reflection = "";
}
public String getDescription() {
    return description;
}
public LocalDate getDate() {
    return date;
}
public boolean isCompleted() {
    return completed;
}
public void markCompleted() {
    this.completed = true;
    }
public void addReflection(String reflection) {
    this.reflection = reflection;
}

public String toString() {
    return "Goal: " + description + " | Date: " + date + " | Completed: " + completed + " | Reflection: " + reflection;
}
}