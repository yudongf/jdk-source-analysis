package cms;

/**
 * -Xms20M -Xmx20M -Xmn10M -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=40 -XX:+UseCMSCompactAtFullCollection -XX:+PrintGC -XX:+PrintHeapAtGC -verbose:gc -XX:+PrintGCTimeStamps -XX:+PrintGCDetails
 -XX:ParallelCMSThreads=10
 -XX:ParallelGCThreads=20
 */
public class CMSCompactAtFullCollectionTest {

  private static int _2M = 2 * 1024 * 1024;

  public static void main(String[] args) {
    byte[] bytes = new byte[_2M];
    byte[] bytes1 = new byte[_2M];
    byte[] bytes2 = new byte[_2M];
    while(true){
      bytes2 = new byte[2*_2M];
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
