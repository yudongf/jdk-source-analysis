package cms;

/**
 * @author : fengyudong3
 * @ClassName : CmsGCTest  //类名
 * @Description : CMS垃圾回收实验  //描述
 * @Date: 2020-12-28 09:31  //时间
 * -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails  -XX:+PrintGCTimeStamps -XX:+UseCMSInitiatingOccupancyOnly -XX:+UseConcMarkSweepGC -XX:+PrintTenuringDistribution  -XX:+PrintHeapAtGC  -XX:+PrintGC -XX:+PrintCMSInitiationStatistics -XX:CMSWaitDuration=3000
 */
public class CmsGCTest {

  private static int _2M = 2 * 1024 * 1024;

  public static void main(String[] args) throws Exception{
    //eden
    byte[] a1 = new byte[_2M];
    //a1内存直接分配到eden区，此时eden区内存占用2m
    byte[] a2 = new byte[_2M];
    //a2内存直接分配到eden区，此时eden区内存占用4m
    byte[] a3 = new byte[_2M];
    //a3内存直接分配到eden区，此时eden区内存占用6m
    System.out.println("分配6M空间，等待gc执行");
    Thread.sleep(4000);
    byte[] memony3 = new byte[2*_2M];
    Thread.sleep(400);
  }
}
