package crud;

import config.Connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class Memberdb {
    public static void insertmember(String idline) {
        Random r = new Random();
        int randomnum = r.nextInt(1000000);
        String sql = ("INSERT INTO member value ('" + randomnum + "','" + idline + "')");
        try {
            Connect c = new Connect();
            Connection con = c.connectDB();
            Statement stm = con.createStatement();
            stm.executeUpdate(sql);
            System.out.println("บันทึกข้อมูลเรียบร้อย");
            con.close();
            stm.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean checkmember(String idline) {
        String sql = "select * from member";
        boolean result = false;
        try {
            Connect c = new Connect();
            Connection con = c.connectDB();
            ResultSet rs = con.createStatement().executeQuery(sql);
            String[] arr = null;
            while (rs.next()) {
                String em = rs.getString(2);
                arr = em.split("\n");
                for (int i =0; i < arr.length; i++){
//                    System.out.println(arr[i]);
                    if (arr[i].equals(idline)){
                        result = true;
                    }
                }
            }
            rs.close();
            con.close();
            return result;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return result;
        }
    }
    public static Integer checkid(String idline) {
        String sql = "select * from member";
        int idpk = 0;
        try {
            Connect c = new Connect();
            Connection con = c.connectDB();
            ResultSet rs = con.createStatement().executeQuery(sql);
            String[] arr = null;
            String[] arrpk = null;
            while (rs.next()) {
                String ipk = rs.getString(1);
                String em = rs.getString(2);
                arrpk = ipk.split("\n");
                arr = em.split("\n");
                for (int i =0; i < arr.length; i++){
//                    System.out.println(arr[i]);
                    if (arr[i].equals(idline)){
                       idpk  = Integer.parseInt(arrpk[i]);
                    }
                }
            }
            rs.close();
            con.close();
            return idpk;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return idpk;
        }
    }
}
