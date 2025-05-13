import java.util.Scanner;
import java.util.HashMap;

public class CourseRegistrationSystem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Here I define student credentials

        final int numOfStudents = 10;
        final int numOfInitials = 2;
        final String studentNumber = "20222905010";
        final String studentName = "HuseyinCanKayim";

        String students[][] = new String[numOfStudents][numOfInitials];

        for (int i = 0; i < numOfStudents; i++){
            students[i][0] = studentName + (i+1);
            students[i][1] = Long.toString(Long.parseLong(studentNumber)+i);
        }

        Student std1 = new Student(students[0][0],students[0][1]);
        Student std2 = new Student(students[1][0],students[1][1]);
        Student std3 = new Student(students[2][0],students[2][1]);
        Student std4 = new Student(students[3][0],students[3][1]);
        Student std5 = new Student(students[4][0],students[4][1]);
        Student std6 = new Student(students[5][0],students[5][1]);
        Student std7 = new Student(students[6][0],students[6][1]);
        Student std8 = new Student(students[7][0],students[7][1]);
        Student std9 = new Student(students[8][0],students[8][1]);
        Student std10 = new Student(students[9][0],students[9][1]);

        HashMap<String, Student> studentMap = new HashMap<>();
        
        //Here student numbers linked to student classes

        studentMap.put(std1.getNumber(), std1);
        studentMap.put(std2.getNumber(), std2);
        studentMap.put(std3.getNumber(), std3);
        studentMap.put(std4.getNumber(), std4);
        studentMap.put(std5.getNumber(), std5);
        studentMap.put(std6.getNumber(), std6);
        studentMap.put(std7.getNumber(), std7);
        studentMap.put(std8.getNumber(), std8);
        studentMap.put(std9.getNumber(), std9);
        studentMap.put(std10.getNumber(), std10);

        //Here is course informations
        
        Course course1 = new Course("ACM222","Structural Programming","Monday",3,5);
        Course course2 = new Course("ACM262","Introduction To Web Design","Tuesday",0,5);
        Course course3 = new Course("ACM321","Object Oriented Programming","Thursday",4,5);
        Course course4 = new Course("STAT410","Statistics","Monday",1,5);
        Course course5 = new Course("TKL201","Turkish Language I","Thursday",6,5);
        Course course6 = new Course("AFE122","Advanced English II","Wednesday",0,5);
        Course course7 = new Course("COMP102","Essentials Of Software Development","Friday",1,5);
        Course course8 = new Course("ACM114","Introduction To Computer Science And Programming","Wednesday",2,5);
        Course course9 = new Course("COMP134","Applied Finite Mathematics","Friday",0,5);
        Course course10 = new Course("ACM221","System Analysis And Algorithms","Tuesday",7,5);

        HashMap<String, Course> courseMap = new HashMap<>();

        //Here I created a hashmap to link course codes with its clases

        courseMap.put(course1.getCode(),course1);
        courseMap.put(course2.getCode(),course2);
        courseMap.put(course3.getCode(),course3);
        courseMap.put(course4.getCode(),course4);
        courseMap.put(course5.getCode(),course5);
        courseMap.put(course6.getCode(),course6);
        courseMap.put(course7.getCode(),course7);
        courseMap.put(course8.getCode(),course8);
        courseMap.put(course9.getCode(),course9);
        courseMap.put(course10.getCode(),course10);

        //This is where definitions finished and main program starts

        while(true){
            
            //Here is where user inputs its student number and proceeds to system if input is valid

            System.out.print("\nWelcome to the Course Registration System.\n\n" +
                                "Enter you student number(Q to exit): ");
            String ans = input.next();
            String token = "";
            
            

            for (int i = 0; i < numOfStudents; i++){
                
                //Here I check input rather it is valid or not

                if (ans.equals(students[i][1])) {
                    token = students[i][1];
                    System.out.println("Hello " + students[i][0]);
                    Student dummy = studentMap.get(students[i][1]);
                    
                    //Inside this while loop user can choose one of these options from 1 to 6

                    while(true){
                        System.out.print("\n1.Add Course\n2.Drop Course\n3.Log Out\n4.Show My Courses\n5.Display Course Info\n6.Display My Schedule\nChoice: ");
                        String choice = input.next();
                        
                        //Here is adding course part

                        if (choice.equals("1")){
                            System.out.println();
                            Course.courseCodes();
                            System.out.print("Choose a course to add: ");
                            String courseChoice = input.next();
                            int switchChoice = 0;
                            
                            if(courseChoice.equals("1") || courseChoice.equals("2") ||
                               courseChoice.equals("3") || courseChoice.equals("4") || 
                               courseChoice.equals("5") || courseChoice.equals("6") || 
                               courseChoice.equals("7") || courseChoice.equals("8") || 
                               courseChoice.equals("9") || courseChoice.equals("10")){
                               switchChoice = Integer.parseInt(courseChoice);
                               }
                            
                            switch(switchChoice){
                                case 1:
                                    dummy.addCourse(courseMap.get(course1.getCode()));
                                    break;
                                case 2:
                                    dummy.addCourse(courseMap.get(course2.getCode()));
                                    break;
                                case 3:
                                    dummy.addCourse(courseMap.get(course3.getCode()));
                                    break;
                                case 4:
                                    dummy.addCourse(courseMap.get(course4.getCode()));
                                    break;
                                case 5:
                                    dummy.addCourse(courseMap.get(course5.getCode()));
                                    break;
                                case 6:
                                    dummy.addCourse(courseMap.get(course6.getCode()));
                                    break;
                                case 7:
                                    dummy.addCourse(courseMap.get(course7.getCode()));
                                    break;
                                case 8:
                                    dummy.addCourse(courseMap.get(course8.getCode()));
                                    break;
                                case 9:
                                    dummy.addCourse(courseMap.get(course9.getCode()));
                                    break;
                                case 10:
                                    dummy.addCourse(courseMap.get(course10.getCode()));
                                    break;
                                default:
                                    System.out.println("Invalid choice.");

                            }
                        }

                        //Here is dropping course part
                        
                        else if (choice.equals("2")){
                            System.out.println();
                            Course.courseCodes();
                            System.out.print("Choose a course to drop: ");
                            String courseChoice = input.next();
                            int switchChoice = 0;
                            
                            if(courseChoice.equals("1") || courseChoice.equals("2") ||
                               courseChoice.equals("3") || courseChoice.equals("4") || 
                               courseChoice.equals("5") || courseChoice.equals("6") || 
                               courseChoice.equals("7") || courseChoice.equals("8") || 
                               courseChoice.equals("9") || courseChoice.equals("10")){
                               switchChoice = Integer.parseInt(courseChoice);
                               }
                            
                            switch(switchChoice){
                                case 1:
                                    dummy.dropCourse(courseMap.get(course1.getCode()));
                                    break;
                                case 2:
                                    dummy.dropCourse(courseMap.get(course2.getCode()));
                                    break;
                                case 3:
                                    dummy.dropCourse(courseMap.get(course3.getCode()));
                                    break;
                                case 4:
                                    dummy.dropCourse(courseMap.get(course4.getCode()));
                                    break;
                                case 5:
                                    dummy.dropCourse(courseMap.get(course5.getCode()));
                                    break;
                                case 6:
                                    dummy.dropCourse(courseMap.get(course6.getCode()));
                                    break;
                                case 7:
                                    dummy.dropCourse(courseMap.get(course7.getCode()));
                                    break;
                                case 8:
                                    dummy.dropCourse(courseMap.get(course8.getCode()));
                                    break;
                                case 9:
                                    dummy.dropCourse(courseMap.get(course9.getCode()));
                                    break;
                                case 10:
                                    dummy.dropCourse(courseMap.get(course10.getCode()));
                                    break;
                                default:
                                    System.out.println("Invalid choice.");

                            }

                        }

                        //Here is log out part
                        
                        else if (choice.equals("3")) break;

                        //Here is where user can see its courses

                        else if (choice.equals("4")) dummy.showMyCourses();

                        //Here is course informations
                        
                        else if (choice.equals("5")) {
                            System.out.println();
                            course1.displayInfo();
                            course2.displayInfo();
                            course3.displayInfo();
                            course4.displayInfo();
                            course5.displayInfo();
                            course6.displayInfo();
                            course7.displayInfo();
                            course8.displayInfo();
                            course9.displayInfo();
                            course10.displayInfo();
                        
                        }

                        //Here is student schedule

                        else if (choice.equals("6")) dummy.showMySchedule();

                        //If user doesnt choose one of these options above, program prints invalid choice as a warning

                        else System.out.println("Invalid choice.");
                            
                    }


                }
            }

            //In this part, if user wanted to quit the program and typed q or Q, it breaks most outher while loop and shuts down the program

            if (ans.toUpperCase().equals("Q")) {
                System.out.println("Goodbye...");
                break;
            }
            
            //If user doesnt input any valid input system forces user to continue the loop until it gets valid input

            else if (token.equals("")){System.out.println("Invalid input."); continue;}
            
        }
        input.close();
    }
}