package PWskill;public class Day16AssQue8 {    public static void main(String[] args) {        //WAP to find the maximum occurring character in a string.        String s = "AAAbbc";        int len = s.length();        int mx = -1;        char result = 0;        int[] count = new int[256];        for(int i =0;i<len;i++){            count[s.charAt(i)]++;        }        for(int i =0;i<len;i++){            if(mx<count[s.charAt(i)]){                mx = count[s.charAt(i)];                result = s.charAt(i);            }        }        System.out.println(result);    }}