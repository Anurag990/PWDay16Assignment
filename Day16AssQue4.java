package PWskill;import java.sql.SQLOutput;public class Day16AssQue4 {    public static void main(String[] args) {        //WAP to count the number of consonants, vowels, special characters in a string.        String s = "aeiou$%@xyz";        int len = s.length();        int v =0;        int s1=0;        int c =0;        for(int i=0;i<len-1;i++){            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' ){                v++;            }            else if(s.charAt(i) >= 32 && s.charAt(i) <= 64){                s1++;            }        }        c = len - v - s1;        System.out.println("Total length of String : "+len);        System.out.println("Total no. vowels in string : "+v);        System.out.println("Total no. special character in string : "+s1);        System.out.println("Total no. consonants in string : "+c);    }}