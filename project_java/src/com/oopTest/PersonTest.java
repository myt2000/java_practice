
package com.oopTest;
/*
* 属性 = 成员变量 = field = 域、字段
* 方法 = 成员变量 = 函数 = method
*
* 创建类的对象 = 实例化的对象 = 实例化类
*
*
*  * 类中属性的使用
*
* 属性（成员变量）   vs  局部变量
* 1.相同点：
* 		1.1  定义变量的格式：数据类型  变量名 = 变量值
* 		1.2 先声明，后使用
* 		1.3 变量都有其对应的作用域
* 2.不同点：
* 		2.1 在类中声明的位置的不同
* 		属性：直接定义在类的一对{}内
* 		局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量
*
* 		2.2 关于权限修饰符的不同
* 		属性：可以在声明属性时，指明其权限，使用权限修饰符。
* 			常用的权限修饰符：private、public、缺省、protected  --->封装性
* 			目前，大家声明属性时，都使用缺省就可以了。
* 		局部变量：不可以使用权限修饰符。
*
* 		2.3 默认初始化值的情况：
* 		属性：类的属性，根据其类型，都有默认初始化值。
* 			整型（byte、short、int、long）：0
* 			浮点型（float、double）：0.0
* 			字符型（char）：0  （或'\u0000'）
* 			布尔型（boolean）：false
*
* 			引用数据类型（类、数组、接口）：null
*
* 		局部变量：没有默认初始化值。
*  		意味着，我们在调用局部变量之前，一定要显式赋值。
* 			特别地：形参在调用时，我们赋值即可。
*
* 		2.4 在内存中加载的位置：
* 		属性：加载到堆空间中   （非static）
* 		局部变量：加载到栈空间
*
* */


/*
* 构造器（constructor）
* Construct:建设、构造
* 构造器就是方法与类同名的定义一个方法，这样就是个构造器，实例化类的时候可以给类传参
* 一、构造器的作用
* 1.创建对象
* 2.初始化对象的信息
*
*
* 二、说明：
* 1.如果没有显示的定义类的构造器的话，则系统默认提供一个空参数的构造器
* 2.定义构造器的格式：权限修饰符 类名（形参列表）{}
* 3.一个类中定义的多个构造器，彼此构成重载
* 4.一旦我们显示的定义了累的构造器之后，系统就不在提供默认的空参构造器
* 5.一个类中，至少会有一个构造器
*
* */


/*
* this关键字使用
* 1.this可以用来修饰：属性、方法、构造器
*
* 2.this修饰属性和方法
*   this理解为当前对象
*
* 3.this修饰调用构造器
*   1.我们在类的构造器中，可以显式的使用"this(形参列表)"方式，调用本类中指定的其他构造器
*   2.构造器中不能通过"this(形参列表)"方式调用自己
*   3.如果一个类中有n个构造器，则最多有n-1构造器中使用"this(形参列表)"
*   4.规定："this（形参列表）"必须声明在当前构造器的首行
*   5.构造器内部，最多只能声明一个"this(形参列表)"，用来调用其他的构造器
* */





public class PersonTest {
    public static void main(String[] args){
        //创建Person类的对象

        // 一旦我们显示的定义了累的构造器之后，系统就不在提供默认的空参构造器
//        Person p1 = new Person();

        Person p1 = new Person("Tom");
        //调用对象的结构、属性、方法
        //调用属性：“对象、属性”
//        p1.name = "Jack";
        p1.isMale = false;
//        System.out.println(p1.name);
        // 调用方法
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");

        Person p2 = new Person("Henry");
//        p2.name = "Henry";
//        System.out.println(p1.name);

        Person p3 = p1;
//        p3.age = 10;
//        System.out.println("年龄"+p1.age);

//        User u1 = new User();
//        u1.talk("日语");
//        u1.eat();

    }

}

class Person{
    private String name;
    private int age =1;
    boolean isMale;

    public Person(String n){
        name = n;
    }

    public Person(String n, int a){
        name = n;
        age = a;

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }


    public void eat(){
        System.out.println("人可以吃饭");
    }

    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){
        System.out.println("人可以说话，使用的是：" + language);
    }
}



//class User{
//    //属性（或成员变量）
//    String name;
//    public int age;
//    boolean isMale;
//
//    public void talk(String language){
//        System.out.println("我们使用"+ language+ "进行交流");
//    }
//
//    public void eat(){
//        String food="苹果";
//        System.out.println("我们喜欢" + food);
//    }
//}


