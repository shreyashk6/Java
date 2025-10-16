public class MainClass1 { 
    public static void main(String[] args) throws InterruptedException {
        A obj1 = new A();
        B obj2 =  new B();
        System.out.println(obj1.getPriority());
      //  obj2.setPriority(Thread.MAX_PRIORITY); //now class b ll execute first       
        System.out.println(obj2.getPriority());
        
        obj1.start();   //NOW BOTH Class A AND Class B will run PARALLEL to each other
        try {Thread.sleep(5);
        } catch (InterruptedException e) {e.printStackTrace();}
        obj2.start();
        Thread.sleep(5);  //i directly threw execption on main uising "throws"  (not recommended)
    }
}


class A extends Thread{
    public void run(){      //REMEMBER IN EVERY THREAD WE NEED TO HAVE A run() METHOD
        for(int i = 0; i < 100; i++){
            System.out.println("Hi From i " +i );
            try {Thread.sleep(10);                  //increases chances of 1by1 execution buy does not provide 100% successrate so try using sleep in main method while calling the thread
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}
class B extends Thread{
    public void run(){      //REMEMBER IN EVERY THREAD WE NEED TO HAVE A run() METHOD
        for(int j = 0;j<100;j++){
            System.out.println("Hello From j " + j);
            try {Thread.sleep(10);
            }catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}