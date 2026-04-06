package com.java.fundamentals;

public class PrimitiveAssignments {
    public static void main(String[] args) {
        //Assignment 1 -- Employee data management
        int employeeId = 52214111;
        byte age = 27;
        char departmentCode = 'S';
        double monthlySalary = 98000.56D;
        short yearsOfExperience = 10;
        long mobileNumber = 9392723505L;
        boolean isPermanentEmployee = true;
        float performanceRating = 5.0f;
        System.out.println("----------------Employee Details----------------");
        System.out.println("ID: " + employeeId);
        System.out.println("Age: " + age);
        System.out.println("Department Code: " + departmentCode);
        System.out.println("Salary: " + monthlySalary);
        System.out.println("Experience: " + yearsOfExperience + "years");
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Permanent: " + isPermanentEmployee);
        System.out.println("Rating: " + performanceRating);

        //Assignment 2 Student data management
        int rollNumber = 522141161;
        byte studentAge = 19;
        char section = 'C';
        int totalMarks = 949;
        float averageMarks = 79.6F;
        short yearOfJoining = 2026;
        long studentMobileNumber = 9392723503L;
        boolean isPassed = true;
        System.out.println("------ student Details-----");
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Age: " + studentAge);
        System.out.println("Section: " + section);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average: " + averageMarks);
        System.out.println("Year of Joining: " + yearOfJoining);
        System.out.println("Mobile: " + studentMobileNumber);
        System.out.println("Passed: " + isPassed);

        //Assignment 3 Product data management
        int productId = 603;
        char categoryCode = 'J';
        short quantityAvailable = 38;
        double unitPrice = 889.00D;
        float discountPercentage = 15.9F;
        long supplierContact = 9292723406L;
        boolean isProductAvailable = true;
        byte productRating = 4;
        System.out.println("------- Product Details ------");
        System.out.println("ID: " + productId);
        System.out.println("Category Code: " + categoryCode);
        System.out.println("Quantity: " + quantityAvailable);
        System.out.println("Price: " + unitPrice);
        System.out.println("Discount: " + discountPercentage + "%");
        System.out.println("Supplier Contact: " + supplierContact);
        System.out.println("Available: " + isProductAvailable);
        System.out.println("Rating: " + productRating);
    }
}
