package org.example;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
class A{

}
class B extends A{

}class C extends B{

}
public class App

{

  int[] a = {
            1,2,-3,4,-5,6,11,235,33,252,-2222,3333,-2521,2355555,150,3
    };
        public void innerSort(){
            int in,out,temp;

            for(out=1;out<a.length;out++){
                temp=a[out];
                in=out;
                while(in>0 && (a[in-1]>=temp)){
                    a[in]=a[in-1];
                    in--;
                }
                a[in]=temp;
            }
        }
               public int findDouble(long some){
              int begin=0;
              int end= a.length-1;
              int curin;
              while(true){
                  curin=(begin + end)/2;
                  System.out.println(curin+"-curin|"+begin+"-begin|"+end+"-end||");
                  if(a[curin]==some) return curin;
                  else if (begin > end) return a.length;
                  else {
                      if(a[curin] < some) begin=curin+1;
                      else end=curin- 1;
                  }

              }

               }
    public void sortBubble(){

        for(int out=a.length-1;1<out;out--){
            for(int in=0;in<out;in++){

                if(a[in]>a[in+1]){
                   int temp = a[in];
                    a[in]=a[in+1];
                    a[in+1]=temp;
                }
            }
        }
    }



    //selection sort
  public void sortSelection(){
       int min=0,in=0,temp;
      for(int out=0;out<a.length;out++){
       
          for(in =out+1;in<a.length;in++){

              if(a[in]<a[out]){

                  temp = a[ out];
                  a[out]=a[in];
                  a[in]=temp;

              }
          }
      }
  }
   public  void remove(int n){

       for(int t=n;t<a.length-1;t++){
           System.out.print(a[t]+"__");
           a[t] =a[t+1];
       System.out.println(a[t]+"|end");
       }
       a[a.length-1]=0;
   }
    public static void main( String[] args )
    {
        /*App myap = new App();
        //myap.sortSelection();
        //  myap.sortBubble();
        myap.innerSort();

        System.out.println( Arrays.stream(myap.a).boxed().collect(Collectors.toList()));
        System.out.println(myap.findDouble(3));*/

        A aa;
        B bb= new B();
        C cc= new C();
        aa= bb;
        Class<A> aClass = A.class;
        System.out.println(bb instanceof C);
        System.out.println(aa.getClass().getName());
    }
}
