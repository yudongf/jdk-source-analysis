package gcroots;

/**
 * @ClassName : TestGCRoots02  //类名
 * @Description :   试方法区中的静态变量引用的对象作为GCRoots
 * @Date: 2020-12-27 23:32  //时间
 *  -Xms1024m -Xmx1024m -Xmn512m -XX:+PrintGCDetails
 */
public class TestGCRoots02 {

  private static int _10MB = 10 * 1024 * 1024;
  private byte[] memory;

  private static TestGCRoots02 t;

  public TestGCRoots02(int size) {
    memory = new byte[size];
  }

  public static void main(String[] args) throws Exception{
    TestGCRoots02 t2 = new TestGCRoots02(11 * _10MB);
    Thread.sleep(100);
//    t2.t = new TestGCRoots02(8 * _10MB);
//    System.gc();
//    Thread.sleep(4000);
//    t2 = null;
//    System.gc();
  }
}
