import java.io.*;
import java.util.*;

public class Solution {
    public static void reverse(char str[])
    {
        int r=str.length-1;
        int l=0;
        while(l<r){
            if (!Character.isLetterOrDigit(str[l])) l++;
            else if (!Character.isLetterOrDigit(str[r])) r--;
            else
            {
                char temp=str[l];
                str[l]=str[r];
                str[r]=temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] charArray=str.toCharArray();
        reverse(charArray);
        String revStr=new String(charArray);
        System.out.println(revStr);
    }
}
