import com.kickstarter.controllers.AccountController;
import com.kickstarter.logic.domain.User;
import com.kickstarter.logic.services.IUserService;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
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
        String result = accountController.Logoff();

        assertEquals(result, "index");
    }
}
