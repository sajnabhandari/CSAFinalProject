public class User {
private String name;
private int totalgoals = 0;
public User(String name, int totalgoals) {
    this.name = name;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getTotalgoals() {
    return totalgoals;
}
public void addGoal() {
    this.totalgoals++;
}
public void setTotalgoals(int totalgoals) {
    this.totalgoals = totalgoals;
}
}
