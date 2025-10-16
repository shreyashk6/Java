public class MainClassThrea {
    public static void main(String[] args){ //throws InterruptedException {
        // A obj1 = new A();     //NO USE
        // B obj2 =  new B();
        // System.out.println(obj1.getPriority()); //DOESNT WORK HERE
        // obj2.setPriority(Thread.MAX_PRIORITY); //now class b ll execute first       
        // obj1.start();   //THIS start() METHOD WONT WORK CZ Runnable INTERFACE DOESNT CONSIST OF sTART METHOD
        // obj2.start();   //DOESNT WORK
        
        //SO USE THE BELOW METHOD
        Runnable obj1 = new A();
        //Runnable obj2= new B();   //Lets Try a shortcut method!
        // Runnable obj2 = new Runnable(){  //Lets Create a Lambda expression and make it simpler
        Runnable obj2 = () ->{  //can be written like this or the above linne (ur choice)
                                // public void run(){      //REMEMBER IN EVERY THREAD WE NEED TO HAVE A run() METHOD
                                    for(int j = 0;j<5;j++){
                                        System.out.println("Hello From j " + j);
                                        try {Thread.sleep(10);
                                        }catch (InterruptedException e) {e.printStackTrace();}
                                    }
                                }
        ;  //add a semi column here cz used lambda shortcut
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start(); //WORKS CZ START IS PRESENT INSIDE THREAD();
        t2.start();
    }
}


class A implements Runnable{
    public void run(){      //REMEMBER IN EVERY THREAD WE NEED TO HAVE A run() METHOD
        for(int i = 0; i < 5; i++){
            System.out.println("Hi From i " +i );
            try {Thread.sleep(10);                  //increases chances of 1by1 execution buy does not provide 100% successrate so try using sleep in main method while calling the thread
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}
// class B implements Runnable{
//     public void run(){      //REMEMBER IN EVERY THREAD WE NEED TO HAVE A run() METHOD
//         for(int j = 0;j<5;j++){
//             System.out.println("Hello From j " + j);
//             try {Thread.sleep(10);
//             }catch (InterruptedException e) {e.printStackTrace();}
//         }
//     }
// } 

