/*
Check README file for the Question and Algorithm
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dictionary size");
        int dict_len=sc.nextInt();
        System.out.println("Enter query size");
        int q_len=sc.nextInt();
        List<String> dictionary=new ArrayList<>(dict_len);
        System.out.println("Enter dict elements");
        for(int i=0;i<dict_len;i++)
            dictionary.add(sc.next());
        List<String> query=new ArrayList<>(q_len);
        System.out.println("Enter query elements");
        for(int i=0;i<q_len;i++)
            query.add(sc.next());
        System.out.println(stringAnagrams(dictionary,query));
    }
    static List<Integer> stringAnagrams(List<String> dict,List<String> query)
    {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<query.size();i++)
        {
            int count=0;
            for(int j=0;j<dict.size();j++)
            {
                if(anagrams(query.get(i),dict.get(j))==true)
                    count++;
            }
            ans.add(count);
        }
        return ans;
    }
    static boolean anagrams(String s1,String s2)
    {
        if(s1.length()!=s2.length())
            return false;
        int[] count=new int[256];
        for(int i=0;i<s1.length();i++)
            count[s1.charAt(i)]++;
        for(int i=0;i<s2.length();i++)
            count[s2.charAt(i)]--;
        for(int i=0;i< count.length;i++)
        {
            if(count[i]!=0)
                return false;
        }
        return true;
    }
}
