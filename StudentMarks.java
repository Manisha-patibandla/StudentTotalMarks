import java.util.*;
import java.util.Map.Entry;
public class StudentMarks{
    public static void main(String[] args) {
        Map<Integer,List<Integer>> students= new HashMap<>();
        Map<Integer,Integer> totalScore =new HashMap<>();
        //adding the id and marks of student
       students.put(527,Arrays.asList(90,70,70));
       students.put(538,Arrays.asList(40,70,20));
       students.put(560,Arrays.asList(20,50,40));
       students.put(541,Arrays.asList(10,50,60));
       students.put(503,Arrays.asList(20,50,40));
        int sum=0;
          //getting the values from the arraylist
       for(Entry<Integer, List<Integer>> ele:students.entrySet()){
         List<Integer> values=ele.getValue();
           sum=0;
           //summation of marks
        for(int marks:values){
            sum+=marks;
        }
         totalScore.put(ele.getKey(),sum);
       }
       //print the result
       System.out.println(totalScore);
    }  
    
    }

