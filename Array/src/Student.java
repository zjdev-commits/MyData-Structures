public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args){
        Student s1 = new Student("liming",12);
        Student s2 = new Student("li2",21);
        Student s3 = new Student("lix",32);
        Student s4 = new Student("lixxiao",32);
        Array<Student> array = new Array<Student>();
        array.addLast(s1);
        array.addLast(s2);
        array.addLast(s3);
        array.addLast(s4);
        System.out.println(array.toString());
    }

}
