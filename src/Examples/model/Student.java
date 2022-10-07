package Examples.model;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private Integer grade;

    public Student() {
    }

    public Student(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    /*@Override
    public int compareTo(Student s) {
        if(this.name == null) {
            return 0;
        }
        return this.name.compareTo(s.name);
    }*/

     /*@Override
    public int compareTo(Student s) {

         if (this.grade == s.grade) return 0;
         if (this.grade > s.grade) return 1;
         if (this.grade < s.grade) return -1;

         return -1;
    }*/

    @Override
    public int compareTo(Student s) {

        if(this.grade.equals(null)) {
            return 0;
        }
        return this.grade.compareTo(s.grade);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //compare with the instance, if they have the same reference, they are equals
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(grade, student.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
        //if in the hashcode we left only the name and we also
        // take out the comparison by grade in the equals,
        // it would only detect the unique values only by the name
    }
}
