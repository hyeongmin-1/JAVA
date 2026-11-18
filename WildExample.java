import java.util.Arrays;

public class WildExample {
    public static void registerCourse(Course<?> course){
        System.out.println(course.getName() + "수강생: " + 
            Arrays.toString(course.getStudents()));
    }
    public static void registerCourseStudent(Course<? extends Student2> course){
        System.out.println(course.getName() + "수강생: " + 
            Arrays.toString(course.getStudents()));
    }
    public static void registerCourseWorker(Course<? super Worker>course){
        System.out.println(course.getName() + "수강생: " +
            Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        Course<Person1> personCourse = new Course<Person1>("일반인 과정", 5);
        personCourse.add(new Person1("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student2("학생"));
        personCourse.add(new HighStudent("고등학생"));


        Course<Worker> workCourse = new Course<Worker>("직장인 과정", 05);
        workCourse.add(new Worker("직장인"));

        Course<Student2> studentCourse = new Course<Student2>("학생 과정", 5);
        studentCourse.add(new Student2("학생"));
        studentCourse.add(new HighStudent("고등학생"));

        Course<HighStudent> highStudentCourse = new Course<HighStudent>("고등학생 과정", 5);
        highStudentCourse.add(new HighStudent("고등학생"));

        registerCourse(personCourse);
        registerCourse(workCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        System.out.println();

        //여기서부턴 extends 받은 속성이기때문에 상위 속성인 person과 work는 호출 불가능
        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);

        //여기선 super를 받은 속성이기때문에 부모를 호출해야함
        registerCourseWorker(personCourse);
        registerCourseWorker(workCourse);



    }     
    
}
