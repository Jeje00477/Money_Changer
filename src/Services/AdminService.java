/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DAO.AdminDAO;
import Model.Admin;
import java.sql.*;

/**
 *
 * @author jeje
 */
public class AdminService {
    private AdminDAO DAO;
    
    public AdminService() throws SQLException{
        DAO = new AdminDAO();
    }
    
    public boolean Login(String username, String password){
        return DAO.login(username, password);
    }
}
