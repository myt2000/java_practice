package com.finaltest;

interface Info{
}
class Contact implements Info{
    private String address ;      //地址
    private String telephone ;      //电话
    private String zipcode ;        //工号
    public Contact(String address,String telephone,String zipcode){   //构造函数
        this.address = address;
        this.telephone = telephone;
        this.zipcode = zipcode;
    }
    public void setAddress(String address){
        this.address = address ;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone ;
    }
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }
    public String getAddress(){
        return this.address ;
    }
    public String getTelephone(){
        return this.telephone ;
    }
    public String getZipcode(){
        return this.zipcode;
    }
    @Override
    public String toString() {
        return "Contact [address=" + address + ", telephone=" + telephone
                + ", zipcode=" + zipcode + "]";
    }
}
class Introduction implements Info{
    private String name ;      //姓名
    private String sex ;        //性别
    private int age ;           //年龄
    public Introduction(String name,String sex,int age){  //构造函数
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public void setName(String name){
        this.name = name ;
    }
    public void setSex(String sex){
        this.sex = sex ;
    }
    public void setAge(int age){
        this.age = age ;
    }
    public String getName(){
        return this.name ;
    }
    public String getSex(){
        return this.sex ;
    }
    public int getAge(){
        return this.age ;
    }
    @Override
    public String toString() {
        return "Introduction [name=" + name + ", sex=" + sex + ", age=" + age
                + "]";
    }
}

class Person<T extends Info>{
    private T info ;
    public Person(T info){   // 构造函数
        this.info = info;
    }
    public void setInfo(T info){
        this.info = info ;
    }
    public T getInfo(){
        return info ;
    }
    @Override
    public String toString() {
        return "Person [info=" + info + "]";
    }

}
public class GenericPerson{
    public static void main(String args[]){
        Person<Contact> per = null ;
        per = new Person<Contact>(new Contact("红房子","01088888888","102206")) ;
        System.out.println(per);

        Person<Introduction> per2 = null ;
        per2 = new Person<Introduction>(new Introduction("蓝蓝","女",24));
        System.out.println(per2);


        Person<Contact> per3 = new Person<Contact>(new Contact("新之助", "1234324", "432435345"));
        System.out.println(per3) ;
    }
}
//Person [info=Contact [address=红房子, telephone=01088888888, zipcode=102206]]
//Person [info=Introduction [name=蓝蓝, sex=女, age=24]]
//Person [info=Contact [address=新之助, telephone=1234324, zipcode=432435345]]