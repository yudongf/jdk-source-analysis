package cms;

/**
 * @Description : CMS测试  //描述
 * @Date: 2020-12-28 15:18  //时间
 * -Xms20M -Xmx20M -Xmn10M -XX:+UseConcMarkSweepGC -XX:+UseCMSInitiatingOccupancyOnly -XX:+PrintGCDetails -XX:CMSInitiatingOccupancyFraction=40 -XX:+PrintGCTimeStamps -XX:+PrintTenuringDistribution -XX:+PrintGC -XX:+PrintHeapAtGC -XX:+PrintCMSInitiationStatistics
 */
public class CmsGcTest1 {

  private static int _2M = 2 * 1024 * 1024;

  public static void main(String[] args) throws Exception{
    //eden
    byte[] a1 = new byte[_2M];
    System.out.println("分配2M空间");
    //a1内存直接分配到eden区，此时eden区内存占用2m
    System.gc();
    byte[] a2 = new byte[_2M];
    System.out.println("分配4M空间");
    System.gc();
    //a2内存直接分配到eden区，此时eden区内存占用4m
    byte[] a3 = new byte[_2M];
    //a3内存直接分配到eden区，此时eden区内存占用6m
    System.out.println("分配6M空间");
    System.gc();
    byte[] a5 = new byte[2*_2M];
    //a3内存直接分配到eden区，此时eden区内存占用6m
    System.out.println("分配10M空间");
    System.gc();
    byte[] a6 = new byte[_2M];
    System.out.println("分配12M空间");
    System.gc();
    System.in.read();
  }

}
