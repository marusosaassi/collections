package Examples.model;

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
}
