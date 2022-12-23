/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author acidopal
 */
public class DataTransfer {
    public  static int age;
    public  static String name;
    public  static String gender;
    public  static int bodyTypes;

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        DataTransfer.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        DataTransfer.name = name;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        DataTransfer.gender = gender;
    }

    public static int getBodyTypes() {
        return bodyTypes;
    }

    public static void setBodyTypes(int bodyTypes) {
        DataTransfer.bodyTypes = bodyTypes;
    }

   
}
