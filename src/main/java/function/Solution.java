package function;

import java.io.IOException;

public class Solution {
    public String greeting() throws IOException {
       String text = "วิธีการใช้จำดี"+ "\n" + "*****ต้องการบันทึกงาน*****"+ "\n" + "พิมพ์ งานเลยเเล้วตามด้วยคำว่ากำหนดส่งหรือคำว่าส่งเเล้วตามด้วยวัน เช่น"+ "\n" + "ChatbotJumdeeส่ง11/52562"
               + "\n" + "*****ต้องการดูวันส่งงาน*****" + "\n" + "พิมพ์ ถามว่าต้องการเช็คงานส่งหรือมีไรส่งเเล้วตามกำหนดส่ง เช่น" + "\n" + "ต้องการเช็คงานส่ง25/8/2562" + "\n" + "*****ต้องการเก็บคะเเนน*****"
               + "\n" + "พิมพ์ จำคะเเนนเเล้วตามชื่อวิชาเเละได้คะเเนนเท่าไหร่ เช่น " + "\n" + "จำคะเเนนenterpiseได้100"+ "\n" + "*****ต้องการดูคะเเนน*****" + "\n" + "พิมพ์ ดูคะเเนนenterpise เช่น"
               + "\n" + "ขอดูคะเเนนenterpise" + "\n" + "*****ต้องการจำวิชาเรียน*****" + "\n" + "พิมพ์ จำวิชาเรียนเเล้วตามด้วยวิชาเรียนเเละต่อด้วยวันเรียน เช่น" + "\n" +
               "จำวิชาenterpserเรียนวันจันทร์";
        return text;
    }
}