package ObjectOrientedJAVA;

public class userdefined {






       public static void main(String[] args) {
//           System.out.println(student.noofstudents);
//          student s1=new student("momo",44,78.9);
//        //   System.out.println(s1.noofstudents);
//          student s2=new student("anushka" , 67,89.8);
//         //  System.out.println(s2.noofstudents);
//           student s3=new student("avvi",32,78);
//         //  System.out.println(s3.noofstudents);
//           System.out.println(student.noofstudents);  //student.noofstudent
           student s1=new student();

           s1.rno=45;
           System.out.println(s1.name);
           System.out.println(s1.rno);
           student s2=new student( "aryan",23,45.9);
           System.out.println(s2.percent);





    }
}
//we can not define class inside the main because it can not be accessed by the outside function
