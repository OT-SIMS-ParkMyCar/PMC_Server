package com.pmc.service.UserServiceException;

/**
 * Created on 09/03/15.
 *
 * @author stephaneki
 */
public class UsernameOrPasswordEmpty extends Exception {
    public UsernameOrPasswordEmpty() {
        super("Username or password is empty");
    }
}
