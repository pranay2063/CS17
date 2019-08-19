import java.util.*;

class MultithreadingInterface extends Thread{
    private static int counter = 0;
    @Override
    public void run(){
        try{
            System.out.println("Counter for Thread (Name,Id) ("+Thread.currentThread().getName()+","+Thread.currentThread().getId()+") now is "+counter);
            ++counter;
            System.out.println("Incrementing counter to "+counter);
            Thread.sleep(5000);
            System.out.println("Counter for Thread (Name,Id) ("+Thread.currentThread().getName()+","+Thread.currentThread().getId()+") now is "+counter);
            ++counter;
            System.out.println("Incrementing counter to "+counter);
        }
        catch (Exception e){
            System.out.println("An exception was caught.");
        }
    }
}

class MultithreadingGetIdSetName {
    public static void main(String[] args){
        for(int i = 0; i < 5; ++i){
            MultithreadingInterface obj = new MultithreadingInterface();
            obj.setName("Thread "+i);
            obj.start();
            /*
            Counter for Thread (Name,Id) (Thread 1,13) now is 0
            Counter for Thread (Name,Id) (Thread 0,12) now is 0
            Incrementing counter to 2
            Counter for Thread (Name,Id) (Thread 4,16) now is 0
            Incrementing counter to 3
            Counter for Thread (Name,Id) (Thread 3,15) now is 0
            Incrementing counter to 4
            Counter for Thread (Name,Id) (Thread 2,14) now is 0
            Incrementing counter to 5
            Incrementing counter to 1
            Counter for Thread (Name,Id) (Thread 0,12) now is 5
            Counter for Thread (Name,Id) (Thread 1,13) now is 5
            Incrementing counter to 7
            Counter for Thread (Name,Id) (Thread 4,16) now is 5
            Counter for Thread (Name,Id) (Thread 2,14) now is 5
            Incrementing counter to 9
            Counter for Thread (Name,Id) (Thread 3,15) now is 5
            Incrementing counter to 8
            Incrementing counter to 6
            Incrementing counter to 10
             */
        }
    }
}
