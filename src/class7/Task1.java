package class7;

public class Task1 {
    public static void main(String[] args) {
        //create a boolean variable workDay and assign true. Create int variable day and assign it to 1
        //As long as it is workDay print "I need a day off" and increase day
        //Once day is 6 print "I do not need a day off anymore"

        boolean workDay=true;
        int day =1;

        while(workDay){
            if(day<6){
                System.out.println("I need a day off");
            }
           else{
                System.out.println("I do not need a day off anymore");
                workDay=false;
            }
           day++;       //day=day+1 isto je ili day+=1
         }






    }
}
