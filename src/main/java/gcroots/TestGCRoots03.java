package gcroots;

/**
 * @ClassName : TestGCRoots03  //类名
 * @Description : 测试常量引用对象作为GCRoots  //描述
 * @Date: 2020-12-27 23:34  //时间
 * -Xms1024m -Xmx1024m -Xmn512m -XX:+PrintGCDetails
 */
public class TestGCRoots03 {
  private static int _10MB = 10 * 1024 * 1024;
  private static final TestGCRoots03 t = new TestGCRoots03(8 * _10MB);
  private byte[] memory;

  public TestGCRoots03(int size) {
    memory = new byte[size];
  }

  public static void main(String[] args) {
    TestGCRoots03 t3 = new TestGCRoots03(4 * _10MB);
    System.out.println("第一次GC");
    System.gc();
    t3 = null;
    System.out.println("第二次GC");
    System.gc();
  }

}
