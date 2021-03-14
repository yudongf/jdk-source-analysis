package cms;

/**
 * @author : fengyudong3
 * @ClassName : CmsGcThreadTest  //类名
 * @Description : CMS线程数实验  //描述
 * @Date: 2021-01-15 09:23  //时间
 * -Xms20M -Xmx20M -Xmn10M -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=40 -XX:+PrintGC -XX:+PrintHeapAtGC -verbose:gc -XX:+PrintGCTimeStamps -XX:+PrintGCDetails -Xloggc:d:/logs/gc.log
 */
public class CmsGcThreadTest {

  private static int _2M = 2 * 1024 * 1024;

  public static void main(String[] args) {

    while(true){
      byte[] bytes = new byte[_2M];
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
