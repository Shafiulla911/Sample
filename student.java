public class  student{
    private String name;
    public int rollnumber;
    protected char grade;
    public student(String n,int r, char g){
        name = n;
        rollnumber = r;
        grade = g;
    }
    public void displayDetails(){
        System.out.println("name:"+name);
        System.out.println("rollnumber:"+rollnumber);
        System.out.println("grade:"+grade);
    }
}

public class oopdemo{
    public static void main(String[] args) {
        student s1=new student("rahul",101,'a');
        s1.displayDetails();
        s1= null;
        System.gc();
}
}