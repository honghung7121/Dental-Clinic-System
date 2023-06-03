/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.security.MessageDigest;
import org.apache.tomcat.util.codec.binary.Base64;

/**
 *
 * @author Admin
 */
public class PasswordEncoder {
    public static String toSHA1(String str){
        String salt = "8k@3j#2h!7g$5f%4d&1s6a";
        String result = null;
        
        str = str + salt;
        try {
            byte[] dataBytes = str.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            result = Base64.encodeBase64String(md.digest(dataBytes));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public static void main(String[] args) {
//ngamtt@gmail.com
//tunghn@gmail.com
//khanhdn@gmail.com
//anhtt@gmail.com
//hoaqv@gmail.com
//thaotn@gmail.com
//chontnh@gmail.com
//sangmt@gmail.com
//danhcn@gmail.com
//dattl@gmail.com
//anhhn@gmail.com
//quangdn@gmail.com
//dongtc@gmail.com
//minhqd@gmail.com
//phucqk@gmail.com
//kientn@gmail.com
//longtn@gmail.com
//phuocht@gmail.com
//trimn@gmail.com
//nguyenth@gmail.com
//hiennt@gmail.com
//lymh@gmail.com
//haovh@gmail.com
//nhibh@gmail.com
//myvl@gmail.com
//thuptt@gmail.com
//admin@gmail.com
//hoa@gmail.com
//dang@gmail.com
//vananh@gmail.com
//n@gmail.com
//rr@gmail.com
        System.out.println(toSHA1("marknhi"));
        System.out.println(toSHA1("markhao"));
    }
}
