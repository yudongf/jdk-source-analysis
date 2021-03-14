package gcroots;

/**
 * @ClassName : TestGCRoots01  //类名
 * @Description : 虚拟机栈（栈帧中的局部变量）中引用的对象作为GCRoots  //描述
 * @Date: 2020-12-27 22:51  //时间
 *-Xms1024m -Xmx1024m -Xmn512m -XX:+PrintGCDetails
 */
public class TestGCRoots01 {

  private int _10MB = 10 * 1024 * 1024;
  private byte[] memory = new byte[8 * _10MB];

  public static void main(String[] args) {
    method01();
    System.out.println("返回main方法");
    System.gc();
    System.out.println("第二次GC完成");
  }

  public static void method01() {
    TestGCRoots01 t = new TestGCRoots01();
    System.gc();
    System.out.println("第一次GC完成");
  }
}
