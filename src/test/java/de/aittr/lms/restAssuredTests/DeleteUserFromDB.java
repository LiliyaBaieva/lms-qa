package de.aittr.lms.restAssuredTests;

import org.testng.annotations.Test;

import java.sql.SQLException;

public class DeleteUserFromDB extends TestBaseRA{

//    @Test // help to deleteUser from database when it needs.
    public void deleteUser() throws SQLException {
        user.deleteUser("lilu@mal.com");
    }

}
