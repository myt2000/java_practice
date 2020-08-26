package com.finaltest;
import java.lang.Enum;


public class SystemTest {
    public static void main(String[] args){
        String javaVersion = System.getProperty("java.version");
        System.out.println("java的version:" + javaVersion);
        String javaHome = System.getProperty("java.home");
        System.out.println("java的home:" + javaHome);
        String osName = System.getProperty("os.name");
        System.out.println("os的name:" + osName);
        String osVersion = System.getProperty("os.version");
        System.out.println("os的version:" + osVersion);
        String userName = System.getProperty("user.name");
        System.out.println("user的name:" + userName);
        String userHome = System.getProperty("user.home");
        System.out.println("user的home:" + userHome);
        String userDir = System.getProperty("user.dir");
        System.out.println("user的dir:" + userDir);
        //java的version:1.8.0_251
        //java的home:F:\jdk\jre
        //os的name:Windows 10
        //os的version:10.0
        //user的name:Administrator
        //user的home:C:\Users\Administrator
        //user的dir:G:\code\java_practice
    }
}

class Season{
    private final String SEASONNAME;//季节的名称
    private final String SEASONDESC;//季节的描述
    private Season(String seasonName,String seasonDesc){
        this.SEASONNAME = seasonName;
        this.SEASONDESC = seasonDesc; }
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "白雪皑皑");
}

//public enum SeasonEnum {
//    SPRING("春天","春风又绿江南岸"),
//    SUMMER("夏天","映日荷花别样红"),
//    AUTUMN("秋天","秋水共长天一色"),
//    WINTER("冬天","窗含西岭千秋雪");
//    private final String seasonName;
//    private final String seasonDesc;
//    private SeasonEnum(String seasonName, String seasonDesc) {
//        this.seasonName = seasonName;
//        this.seasonDesc = seasonDesc; }
//    public String getSeasonName() {
//        return seasonName; }
//    public String getSeasonDesc() {
//        return seasonDesc; } }


/**
 * @author brooks
 * @version 1.0
 * @see Math.java
 */
//public class JavadocTest {
//    /**
//     * 程序的主方法，程序的入口
//     * @param args String[] 命令行参数
//     */
//    public static void main(String[] args) {
//    }
//    /**
//     * 求圆面积的方法
//     * @param radius double 半径值
//     * @return double 圆的面积
//     */
//    public static double getArea(double radius){
//        return Math.PI * radius * radius; }
//}
//
//public class AnnotationTest{
//    public static void main(String[] args) {
//        @SuppressWarnings("unused")
//        int a = 10;
//    }
//    @Deprecated
//    public void print(){
//        System.out.println("过时的方法");
//    }
//    @Override
//    public String toString() {
//        return "重写的toString方法()"; }
//}

//@WebServlet("/login")
//public class LoginServlet extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
//            ServletException, IOException { }
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
//            ServletException, IOException {
//        doGet(request, response);
//    }
//}
//
//    @Transactional(propagation=Propagation.REQUIRES_NEW,
//            isolation=Isolation.READ_COMMITTED,readOnly=false,timeout=3)
//    public void buyBook(String username, String isbn) {
////1.查询书的单价
//        int price = bookShopDao.findBookPriceByIsbn(isbn);
////2. 更新库存
//        bookShopDao.updateBookStock(isbn);
////3. 更新用户的余额
//        bookShopDao.updateUserAccount(username, price); }
//
//
//@MyAnnotation(value="尚硅谷")
//public class MyAnnotationTest {
//    public static void main(String[] args) {
//        Class clazz = MyAnnotationTest.class;
//        Annotation a = clazz.getAnnotation(MyAnnotation.class);
//        MyAnnotation m = (MyAnnotation) a;
//        String info = m.value();
//        System.out.println(info);
//    } }
//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.TYPE)
//@interface MyAnnotation{
//    String value() default "auguigu"; }
//
//public enum RetentionPolicy{
//    SOURCE,
//    CLASS,
//    RUNTIME
//}
//
//@Retention(RetentionPolicy.SOURCE)
//@interface MyAnnotation1{ }
//@Retention(RetentionPolicy.RUNTIME) @interface MyAnnotation2{ }
//
//
//public class TestTypeDefine<@TypeDefine() U> {
//    private U u;
//    public <@TypeDefine() T> void test(T t){
//    } }
//@Target({ElementType.TYPE_PARAMETER})
//@interface TypeDefine{ }
//
//
//@MyAnnotation
//public class AnnotationTest<U> {
//    @MyAnnotation
//    private String name;
//    public static void main(String[] args) {
//        AnnotationTest<@MyAnnotation String> t = null;
//        int a = (@MyAnnotation int) 2L;
//        @MyAnnotation
//        int b = 10;
//    }
//    public static <@MyAnnotation T> void method(T t) { }
//    public static void test(@MyAnnotation String arg) throws @MyAnnotation Exception { } }
//@Target(ElementType.TYPE_USE)
//@interface MyAnnotation { }