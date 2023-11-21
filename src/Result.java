import java.util.Scanner;

public class Result {

    public int[] subject = new int[5];

    public void inputMarks(){
        Scanner s= new Scanner(System.in);
        for (int i=0; i<5;i++){
            System.out.println("Enter marks:");
            subject[i]=s.nextInt();
        }
    }
    /*public void printMarks(){
        for (int i=0;i<5;i++){
            System.out.println("Marks are:"+subject[i]);
        }
    }
    */
    public void printMarks(){
        int i=0;
        while (i<5){
            System.out.println("Marks are:"+subject[i]);
            i++;
        }
    }
   /* public int totalMark(){
        int total =0;
        for(int i=0; i<5;i++){
            total+=subject[i];
        }
        return total;
    }
    */

    public int totalMark(){
        int total= 0;
        int i=0;
        while (i<5){
            total+=subject[i];
            i++;
        }
        return total;
    }

    public void averageMark(){
        int avg=0;
        int all=totalMark();
        avg=totalMark()/5;
        System.out.println("Average Marks:"+avg);

    }

    public static void main(String[] args) {
        Result r= new Result();
        r.inputMarks();
        r.printMarks();
        System.out.println("Total Marks:"+r.totalMark());
        r.averageMark();
    }


}
