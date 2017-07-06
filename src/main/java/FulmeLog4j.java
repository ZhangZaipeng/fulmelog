import org.apache.log4j.Logger;

/**
 * Created by Administrator on 2017/6/28 0028.
 */
public class FulmeLog4j {

    private static Logger logger = Logger.getLogger(FulmeLog4j.class);

    public static void main(String[] args) throws InterruptedException {
        int index = 0;

        while (true) {
            Thread.sleep(1000);
            logger.info("value is --> " + index++);
        }
    }
}
