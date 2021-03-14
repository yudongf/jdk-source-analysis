package gcroots;

/**
 * @ClassName : TestGCRoots04  //类名
 * @Description : 测试成员变量是否可作为GC Roots  //描述
 * @Date: 2020-12-27 23:40  //时间
 * -Xms1024m -Xmx1024m -Xmn512m -XX:+PrintGCDetails
 */
public class TestGCRoots04 {
  private static int _10MB = 10 * 1024 * 1024;
  private TestGCRoots04 t;
  private byte[] memory;

  public TestGCRoots04(int size) {
    memory = new byte[size];
  }

  public static void main(String[] args) {
    TestGCRoots04 t4 = new TestGCRoots04(4 * _10MB);
    t4.t = new TestGCRoots04(8 * _10MB);
    t4 = null;
    System.gc();
  }
}
