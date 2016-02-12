import com.kickstarter.controllers.HomeController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class HomeControllerTest {

    private HomeController homeController;

    @Before
    public void setUp(){
        homeController = new HomeController();
    }

    @Test
    public void shouldReturnIndex(){
        String result = homeController.Index();

        assertEquals(result, "index");
    }
}
