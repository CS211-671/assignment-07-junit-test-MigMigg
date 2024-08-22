package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("b1", "b123");
        userList.addUser("b2", "b456");
        userList.addUser("b3", "b789");
        // TODO: find one of them
        userList.findUserByUsername("b1");
        // TODO: assert that UserList found User
        User user = userList.findUserByUsername("b2");
        String actual = user.getUsername();
        assertEquals("b2", actual );
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("b1", "b123");
        userList.addUser("b2", "b456");
        userList.addUser("b3", "b789");
        // TODO: change password of one user
        boolean actual = userList.changePassword("b2", "b456", "b321");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("b1", "b123");
        userList.addUser("b2", "b456");
        userList.addUser("b3", "b789");
        // TODO: call login() with correct username and password
        User user = userList.login("b1", "b123");
        // TODO: assert that User object is found
        assertEquals( userList.findUserByUsername("b1"), user );
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("b1", "b123");
        userList.addUser("b2", "b456");
        userList.addUser("b3", "b789");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("b2", "b457");
        // TODO: assert that the method return null
        assertNull(actual);
    }

    @Test
    public void testAddUser() {
        UserList userList = new UserList();
        userList.addUser("b1", "b123");
        userList.findUserByUsername("b1");
        assertEquals( "b1",userList.findUserByUsername("b1").getUsername() );
    }

}