/**
 * Created by ZijunQu on 16/5/24.
 */

import java.io.*;


class Nuke2 {
    public static void main(String[] arg) throws Exception {
        String inputLine;
        BufferedReader keyboard;
        keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a word with more than 2 letter");
        System.out.flush();
        inputLine = keyboard.readLine();
        String nuke2 = "";
        for (int i = 0; i < inputLine.length(); i++) {
            if(i != 1) {
                nuke2 += inputLine.charAt(i);
            }
        }
        System.out.println(nuke2);



    }

}