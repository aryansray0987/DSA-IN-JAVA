package ObjectOrientedJAVA;



public class practice {
//    public static class student{
//        String name;
//        int rno;
//        double percent;
//
//    }
//
//    public static void main(String[] args) {
//        student s1=new student();
//        System.out.println(s1.name); // null
//        System.out.println(s1.rno);  //0             default values
//        System.out.println(s1.percent);  // 0.0
//    }
     public static class student{
         String name;
         int rno;
         String mob;

         public student(String name, int rno, String mob){
             this.name=name;
             this.rno=rno;
             this.mob= mob;
         }
}
    public static void main(String[] args) {
         student s1=new student("aryan",34,"9569952098");
        System.out.println(s1.mob);

    }


}
