/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RC_Student_lab
 */
public class ICETask4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ArrayList<String> list = new ArrayList<String>();
        list.add("Maths");
        list.add("Physics");
        list.add("Chemistry");
        list.add("Biology");
        list.add("Probability");
        
        System.out.println(list);
        
        String[] array = new String[list.size()];
        list.toArray(array);
        
        for(String string: array){
            System.out.println(string);
        }
        int[] input = {1, -2, 0, 5, -1, -4};
        int target = 2;
        ICETask4 obj = new ICETask4();
        System.out.println(obj.sums(input,target));
        
        String dir = System.getProperty("user.home");
        String filename = "TextFile.txt";
        String absolutePath = dir + File.separator + filename;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(absolutePath));
            String content =  "This is the sample text, to file.";
            writer.write(content);
        } catch (IOException ex) {
            Logger.getLogger(ICETask4.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(absolutePath));
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ICETask4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<List<Integer>> sums(int[] nums, int target) {
        List<List<Integer>> myList = new ArrayList<List<Integer>>();
        for(int i = 0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                for(int k = j; k<nums.length; k++){
                    if(i != j && j != k && i!=k && (nums[i] + nums[j] +nums[k] == target)){
                        List<Integer> inner = new ArrayList<Integer>(3);
                        inner.add(nums[i]);
                        inner.add(nums[j]);
                        inner.add(nums[k]);
                        myList.add(inner);
                    }
                }
            }
        }
        return myList;
    }
    
}
