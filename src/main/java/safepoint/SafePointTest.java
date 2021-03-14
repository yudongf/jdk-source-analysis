package safepoint;

/**
 * @author : fengyudong3
 * @ClassName : safepoint.safepoint  //类名
 * @Description :   //描述
 * @Date: 2020-12-28 17:42  //时间
 * -Xms20M -Xmx20M -Xmn10M  -XX:+PrintSafepointStatistics –XX:PrintSafepointStatisticsCount=1 -XX:+PrintGCDetails  -XX:+PrintGCTimeStamps -XX:+UseConcMarkSweepGC
 */
public class SafePointTest {

  private int _2M = 2 * 1024 * 1024;

  public static void main(String[] args) throws Exception{
    SafePointTest safePointTest = new SafePointTest();
    safePointTest.test1();
    safePointTest.test1();
    System.gc();
    safePointTest.test1();
    safePointTest.test1();
    System.gc();
    System.in.read();
  }

  private void test1(){
    int a=0;
    byte[] b1 = new byte[_2M];
    for(int i=0;i<1000;i++){}
  }

}
