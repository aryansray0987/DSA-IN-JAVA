package ObjectOrientedJAVA;



public  class student {
   final  String name="aryansray";
    int rno;
    double percent;

   //noofstudent belogs to class
    static int noofstudents; //here noofstudent  is not created multiple times but one time and get updated each time i call the student class

    public student(){
//this is used when we explicit  define the attributes
        // s1.name="aryan";
       // s1.rno=98;
    }


    //creating a constructor
    public student(String name, int rno, double percent){

       this.rno=rno;
      this.percent=percent;
      noofstudents++;

    }

}
