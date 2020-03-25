package loose.oose.fis.lab.student.manager.model;

import java.util.Objects;

public class Student {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                Double.compare(student.getMeanGrade(), getMeanGrade()) == 0 &&
                getFirstName().equals(student.getFirstName()) &&
                getLastName().equals(student.getLastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAge(), getMeanGrade());
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMeanGrade(double meanGrade) {
        this.meanGrade = meanGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getMeanGrade() {
        return meanGrade;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Student{}";
    }

    public Student(String firstName, String lastName, int age, double meanGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.meanGrade = meanGrade;
    }

    public Student(String lastName, int age, double meanGrade) {
        this.lastName = lastName;
        this.age = age;
        this.meanGrade = meanGrade;
    }

    public Student(String firstName) {
        this.firstName = firstName;
    }

    private String firstName;
    private String lastName;
    private int age;
    private double meanGrade;
}
