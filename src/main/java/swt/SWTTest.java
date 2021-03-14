package swt;

import java.util.ArrayList;
import java.util.List;


public class SWTTest {

  //-Xms20M -Xmx20M -Xss128k -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+PrintHeapAtGC

  public static void main(String[] args) {
    List<Person> persons = new ArrayList<Person>();
    long start = 0L;
    long end = 0L;
    long runtime = 0L;
    int count = 0;
    while(true) {
      start = System.currentTimeMillis();
      persons.add(new Person());
      count++;
      end = System.currentTimeMillis();
      runtime = end - start;
      System.out.println(count + " : Use time in one operation:" + runtime + "ms");
      start = end;
    }
  }

  static class Person{

    private Integer id;

    private String name;

    private int age;

    private String sex;

    private String[] attributes = new String[10240];

    public Integer getId() {
      return id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String getSex() {
      return sex;
    }

    public void setSex(String sex) {
      this.sex = sex;
    }
  }

}
