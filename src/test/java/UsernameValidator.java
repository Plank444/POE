

import com.mycompany.poe_part1.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class UsernameValidator {

    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

   
}