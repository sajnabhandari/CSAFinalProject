public class User {
private String name;
private int totalgoals;
public User(String name, int totalgoals) {
    this.name = name;
    this.totalgoals = totalgoals; 
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
public void addGoals(int goals) {
    this.totalgoals += goals;
}
public void setTotalgoals(int totalgoals) {
    this.totalgoals = totalgoals;
}
}
