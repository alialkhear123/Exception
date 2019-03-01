/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexception;

/**
 *
 * @author Ali Abo Alkhear
 */
public class TestException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
                getExceptionB();
            }catch(ExceptionA ea){
                System.out.println(ea.getMessage());
            }
            try{
                getExceptionC();
            }catch(ExceptionA ea){
                System.out.println(ea.getMessage());
            }

        }

        public static void  getExceptionB() throws ExceptionB{
            throw new ExceptionB("Exception B");
        }

        public static void  getExceptionC() throws ExceptionC{
            throw new ExceptionC("Exception C");
    }
    
}
