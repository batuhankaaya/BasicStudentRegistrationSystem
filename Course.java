public class Course {
    private String code;
    private String name;
    private String day;
    private int hour;
    private int quota;

    public Course(String code, String name, String day, int hour, int quota){
        this.code = code;
        this.name = name;
        this.day = day;
        this.hour = hour;
        this.quota = quota;
    }

    //Here it prints course codes.

    public static void courseCodes(){
        System.out.println("1.ACM222 2.ACM262 3.ACM321 4.STAT410 5.TKL201\n"+
                            "6.AFE122 7.COMP102 8.ACM114 9.COMP134 10.ACM221");
    }

    //Here it prints all the details about courses.

    public void displayInfo(){
        System.out.println("Code: " + code +
                           "\tSchedule: " + day + " between " + (hour+9) + ".00-" + (hour+12) + 
                           ".00\tQuota: " + quota + "/5" +
                           "\tName: " + name);
    }

    //Setters and Getters

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    
}
