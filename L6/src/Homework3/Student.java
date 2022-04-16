package Homework3;

public class Student {
    private int Id;
    private String Name;
    private int Year;
    private double Average;
    private int Edit_Id;

    public int getEdit_Id() {
        return Edit_Id;
    }

    public void setEdit_Id(int edit_Id) {
        Edit_Id = edit_Id;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public double getAverage() {
        return Average;
    }

    public void setAverage(double average) {
        Average = average;
    }
}
