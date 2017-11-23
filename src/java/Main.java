package java;

import java.io.IOException;
import java.util.*;

public class Main {
    
    private static Map<String, Integer> map = new HashMap<String, Integer>();
    
    public static void main(String[] args) {
      Runtime.getRuntime().addShutdownHook(
        new Thread() {
          @Override
          public void run() {
            System.out.println("Entering something, so I'll release the process");
            try {
              System.in.read();
            } catch (IOException e) {
              e.printStackTrace();
            }
            System.out.println("We have accumulated " + map.size() + " entries");
          }
        }
      );
      for(int i = 0; i < 10000; i++) {
        map.put(Integer.toBinaryString(i), i);
      }
    }
   }