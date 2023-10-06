package org.example;
public class CSV  {
    public static void main(String[] args) {
        String template = " Name: %s \n Album: %s \n Year: %s ";
        String result1 = String.format(template, "Black Sabbath", "Black Sabbath", 1970);
        String result2 = String.format(template, "Sleep", "Holy Mountain", 1994);
        String result3 = String.format(template, "Witchcraft", "Witchcraft", 2004);

        System.out.println(result1);





    }
    }

