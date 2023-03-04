package tech.stringoperations;

public class StringConcatanation {

public static void main(String [] args){

    String str1 = "Hello Vinayak ";
    String str2 = "How are you doing Today";

//    str1 = str1+ "How are you doing today";
    str1 = str1 + str2;

    System.out.println("String assignment demo  " + str1);


    String s1 = "abc";
    StringBuffer s2 = new StringBuffer(s1); //false as s2 is object of StringBuffer
//    String s2 = new String(s1);  //true

    System.out.println(s1.equals(s2));


}

}
