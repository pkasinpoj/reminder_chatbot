package function;

import java.io.IOException;

public class Remembersubject {
    public String remembersubject(String msgText) throws IOException {
        System.out.println("here");
        String text;
        String[] arrB = new String[3];
        String[] cut = new String[3];
        try {
            if (msgText.contains("วิชา")){
                arrB = msgText.split("วิชา");
            }else if (msgText.contains("วิชาเรียน")){
                arrB = msgText.split("วิชาเรียน");
            }
            System.out.println(arrB[1]);
            if (arrB[1].contains("เรียนวัน")){
                cut = arrB[1].split("เรียนวัน");
                if (cut[1].equals("จันทร์") || cut[1].equals("อังคาร") || cut[1].equals("พุธ") || cut[1].equals("พฤหัส") || cut[1].equals("ศุกร์") || cut[1].equals("เสาร์") || cut[1].equals("อาทิตย์")) {
                    text = "ชื่อวิชาคือ" + "\n" + cut[0] + "\n" + "เรียนวัน" + cut[1] + "\n" + "บันทึกข้อมูลเสร็จเเล้วครับ";
                } else {
                    text = "ไม่บอกวันเรียนน้องจำดีจำไม่ได้น้า";
                }
            }else if (arrB[1].contains("เรียน")){
                cut = arrB[1].split("เรียน");
                System.out.println(cut [1]);
                if (cut[1].equals("จันทร์") || cut[1].equals("อังคาร") || cut[1].equals("พุธ") || cut[1].equals("พฤหัส") || cut[1].equals("ศุกร์") || cut[1].equals("เสาร์") || cut[1].equals("อาทิตย์")) {
                    text = "ชื่อวิชาคือ" + "\n" + cut[0] + "\n" + "เรียนวัน" + cut[1] + "\n" + "บันทึกข้อมูลเสร็จเเล้วครับ";
                } else {
                    text = "ไม่บอกวันเรียนน้องจำดีจำไม่ได้น้า";
                }
            } else {
                text = "ขออภัยด้วยครับน้องจำดีไม่สามารถบันทึกได้สำเร็จ";
            }
//            System.out.println(cut[0]);
//            System.out.println(cut[1]);
////             System.out.println(cut[2]);
        } catch (Exception e) {
            text = "ขออภัยด้วยครับน้องจำดีไม่สามารถบันทึกได้สำเร็จ";
        }
        return text ;
    }
}
