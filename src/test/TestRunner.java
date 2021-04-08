
package test;

import predictor.ComputerBuyerPredictor;


public class TestRunner {
    public static void main(String[] args) {
        ComputerBuyerPredictor predictor = new ComputerBuyerPredictor();
        
          
        //test case 1
        System.out.println(predictor.predict(0, 0, 0)); 
        
        //test case 2
        System.out.println(predictor.predict(0, 0, 1));    
        
        //test case 3
        System.out.println(predictor.predict(0, 1, 0));
        
        //test case 4
        System.out.println(predictor.predict(0, 1, 1));         
        
        //test case 5
        System.out.println(predictor.predict(1, 0, 0));        
        
        //test case 6
        System.out.println(predictor.predict(1, 0, 1));         
        
        //test case 7
        System.out.println(predictor.predict(1, 1, 0));         
        
        //test case 8
        System.out.println(predictor.predict(1, 1, 1));         
        
        //test case 9
        System.out.println(predictor.predict(2, 0, 0));         
        
        //test case 10
        System.out.println(predictor.predict(2, 0, 1));        
        
        //test case 11
        System.out.println(predictor.predict(2, 1, 0));        
        
        //test case 12
        System.out.println(predictor.predict(2, 1, 1));    
        
        
        
    }
}
