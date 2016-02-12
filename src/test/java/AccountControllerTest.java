import com.kickstarter.controllers.AccountController;
import com.kickstarter.controllers.tools.CustomJsonResult;
import com.kickstarter.controllers.tools.JsonResultModel;
import com.kickstarter.logic.domain.User;
import com.kickstarter.logic.services.IUserService;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Null;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AccountControllerTest {

    @InjectMocks
    private AccountController accountController;

    @Mock
    private IUserService userService;

    private User user;

    @Before
    public void setUp(){
        user = new User();
        user.setUserName("fake_user");

        Mockito.when(userService.getUserByName(any(String.class))).thenReturn(user);
    }

    @Test
    public void shouldLogoffUser(){
        CustomJsonResult result = accountController.Logoff();
        JsonResultModel data = result.getData();

        assertNotNull(data);
        assertNull(data.getErrorMessage());
        assertEquals(data.getData(), true);
    }
}
