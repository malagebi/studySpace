import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/app*.xml", "classpath*:/springmvc*.xml"})
public class BaseTest {
    private static final Logger log = LoggerFactory.getLogger(BaseTest.class);

    @Test
    public void test1() {
        log.info("come ...........");

    }
}
