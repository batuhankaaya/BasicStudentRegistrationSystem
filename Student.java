import java.util.HashMap;
import java.util.HashSet;

public class Student {
    private String name;
    private String number;
    HashSet<String> myCourses = new HashSet<>();

    //This is a tricky part. I used 2-D array to use in course schedule and course intersections.

    private String[][] mySchedule = {{"-","-","-","-","-"},
                                    {"-","-","-","-","-"},
                                    {"-","-","-","-","-"},
                                    {"-","-","-","-","-"},
                                    {"-","-","-","-","-"},
                                    {"-","-","-","-","-"},
                                    {"-","-","-","-","-"},
                                    {"-","-","-","-","-"},
                                    {"-","-","-","-","-"},
                                    {"-","-","-","-","-"}};
    
    public Student(String name, String number){
        this.name = name;
        this.number = number;
    }

    //This part is not used in main code but used while building it.

    public void displayInfo(){
        System.out.println("Name: " + name + " Number: " + number);
    }

    //Adding course algorithm

    public void addCourse(Course a){
        
        //In this part I used hashmap to convert day credentials to a number to use in array

        HashMap<String, Integer> weekMap = new HashMap<>();
        weekMap.put("Monday", 0);
        weekMap.put("Tuesday", 1);
        weekMap.put("Wednesday", 2);
        weekMap.put("Thursday", 3);
        weekMap.put("Friday", 4);
        
        int flag = weekMap.get(a.getDay());

        //In this part it checks if there is anything preventing adding course
        
        if (myCourses.size() == 5 || a.getQuota() == 0 || myCourses.contains(a.getCode()) || 
           !(mySchedule[a.getHour()][flag].equals("-") &&
            mySchedule[a.getHour()+1][flag].equals("-") &&
            mySchedule[a.getHour()+2][flag].equals("-"))) {
            System.out.println("This course cannot be added.");
        }

        //It adds the course and reduces quota and replaces schedule with course code

        else {
            myCourses.add(a.getCode());
            a.setQuota(a.getQuota()-1);
            
            mySchedule[a.getHour()][flag] = a.getCode();
            mySchedule[a.getHour()+1][flag] = a.getCode();
            mySchedule[a.getHour()+2][flag] = a.getCode();

            System.out.println("Done.");
        } 
    }

    //Dropping course part

    public void dropCourse(Course a){
        HashMap<String, Integer> weekMap = new HashMap<>();
        weekMap.put("Monday", 0);
        weekMap.put("Tuesday", 1);
        weekMap.put("Wednesday", 2);
        weekMap.put("Thursday", 3);
        weekMap.put("Friday", 4);
        
        int flag = weekMap.get(a.getDay());

        //It checks that if there is choosed couse inside students courses. If there is it removes it
        
        if (myCourses.contains(a.getCode())){
            myCourses.remove(a.getCode());
            a.setQuota(a.getQuota()+1);

            mySchedule[a.getHour()][flag] = "-";
            mySchedule[a.getHour()+1][flag] = "-";
            mySchedule[a.getHour()+2][flag] = "-";

            System.out.println("Done.");
        }

        //If not it prompts a warning

        else if (!myCourses.contains(a.getCode()))
            System.out.println("You cannot drop a course that you do not picked.");

    }

    //It prints courses

    public void showMyCourses(){
        System.out.println(myCourses);
    }

    //It prints student schedule

    public void showMySchedule(){
        System.out.print("\t\tMONDAY\tTUESDAY\tWDNSDAY\tTHRSDAY\tFRIDAY\n0");
        for (int i = 0; i < mySchedule.length ; i++){
            System.out.print((i+9) + ":00-" + (i+10) + ":00\t");
            for (int j = 0; j < mySchedule[i].length; j++){
                System.out.print(mySchedule[i][j]+ "\t");
            }
            System.out.println("");
        }
    }

    //Getters and Setters below

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public HashSet<String> getMyCourses() {
        return myCourses;
    }

    public void setMyCourses(HashSet<String> myCourses) {
        this.myCourses = myCourses;
    }

    public String[][] getMySchedule() {
        return mySchedule;
    }

    public void setMySchedule(String[][] mySchedule) {
        this.mySchedule = mySchedule;
    }
}
