/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DAO.UserDAO;
import Model.User;
import java.sql.*;
/**
 *
 * @author jeje
 */
public class UserService {
    private UserDAO DAO;
    
    public UserService() throws SQLException{
        DAO = new UserDAO();
    }
    
    public void Register(String username, String name, String phoneNumber, String password)throws SQLException{
        DAO.register(new User(name, phoneNumber, username, password));
    }
    
    public boolean Login(String username, String password){
        return DAO.login(username, password);
    }
}
