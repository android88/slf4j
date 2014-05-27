package chb.test.slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * @author chb
 *
 */
public class TestSlf4j {
        Logger log = LoggerFactory.getLogger(TestSlf4j.class);
        
        public void testLog(){
                log.info("this is a test log");
        }
        /**
         * @param args
         */
        public static void main(String[] args) {
                TestSlf4j slf = new TestSlf4j();
                slf.testLog();
        }
}