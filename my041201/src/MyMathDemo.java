public class MyMathDemo {
    public static void main(String [] args){

        mymath myma=new mymath();
        System.out.println("加法 ："+myma.add(23,34));
        System.out.println("减法 ："+myma.subtract(23,34));
        System.out.println("乘法 ："+myma.multiply(23,34));
        System.out.println("除法 ："+myma.divide(10,4));

//        第二页
        System.out.println("第二页   ++————");


        Demo1 demo1=new Demo1();
        demo1.setX(10);
        demo1.setY(20);
        int result=demo1.sum();
        System.out.println(result);

//        第三页
        Employee employee=new Employee();
        employee.setEid("123456");
        employee.setName("zhouxingche");
        employee.setJob("gaojigognchegns");
        employee.show();

        Employee employee1=new Employee("12312","3321","2331");
        employee1.show();

//        第四页
        ChangFangXing cfx=new ChangFangXing();
        cfx.setLength(100);
        cfx.setWidth(50);
        System.out.println("周长是 :"+cfx.zhouChang());
        System.out.println("面积是： "+cfx.area());


        ChangFangXing cfx2=new ChangFangXing(100,50);
        System.out.println("zhouchagnshi "+cfx2.zhouChang());
        System.out.println("mianjishi "+cfx2.area());



    }
}
