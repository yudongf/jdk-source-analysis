package g1;

import java.util.UUID;

/**
 * @author : fengyudong3
 * @ClassName : G1StringTest  //类名
 * @Description :   使用UUID打印出来G1的regionSize和region大小
 * 参数： -Xms100M -Xmx100M -XX:+UseG1GC XX:+PrintHeapAtGC
 * @Date: 2021-02-25 16:45  //时间
 */
public class G1StringTest {
  public static void main(String[] args) throws Exception {
    for (int i=0; i<Integer.MAX_VALUE; i++){
      // 利用UUID不断生成字符串，这些字符串都会在堆中分配，导致不断塞满Eden区引起YoungGC
      UUID.randomUUID().toString();
      if (i>=100000 && i%100000==0){
        System.out.println("i="+i);
        Thread.sleep(3000);
      }
    }
    Thread.sleep(3000);
  }

}
