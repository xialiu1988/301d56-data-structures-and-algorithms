package multiBracketValidation;


import java.util.Stack;

public class MultiBracketValidation {
   public static void main(String[] args){
       String input = "{ (})";
      boolean b = multiBracketValidation(input);
      System.out.println(b);
   }


   public static boolean multiBracketValidation(String input){

       Stack s = new Stack();
     for(int i=0;i<input.length();i++){

         if(input.charAt(i)=='['||input.charAt(i)=='('||input.charAt(i)=='{')
         {
             s.push(input.charAt(i));
         }

         if(input.charAt(i)==']')
      { if (!s.empty() && s.peek().equals('[')){
              s.pop();
          }
          else return false;

      }


         if(input.charAt(i)==')')
         { if (!s.empty() && s.peek().equals('(')){
                 s.pop();
             }
             else return false;

         }


         if(input.charAt(i)=='}')
         { if (!s.empty() && s.peek().equals('{')){

                 s.pop();
             }
             else return false;
         }

     }

       if(s.empty())return true;
       else return false;
   }

}
