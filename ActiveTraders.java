/*
Check README file for the Question and Algorithm
*/
import java.util.*;
public class Hacker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer size");
        int size=sc.nextInt();
        List<String> customers=new ArrayList<>(size);
        for(int i=0;i<size;i++)
            customers.add(sc.next());
        System.out.println(mostActive(customers));
    }
    public static List<String> mostActive(List<String> customers) {
        HashMap<String,Integer> hm=new HashMap<>();
        List<String> ans=new ArrayList<>();
        for(int i=0;i<customers.size();i++)
        {
            if(hm.containsKey(customers.get(i)))
                hm.put(customers.get(i), hm.get(customers.get(i))+1);
            else
                hm.put(customers.get(i), 1);
        }
        for(Map.Entry<String,Integer> e:hm.entrySet())
        {
            int value=e.getValue();
            int percent=(value*100)/customers.size();
            if(percent>=5)
                ans.add(e.getKey());
        }
        Collections.sort(ans);
        return ans;
    }
}
