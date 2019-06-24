# Operating System


**OS Basics**  - *https://www.geeksforgeeks.org/operating-systems/#basics*

1. **What happens when we turn on computer?**
2. **Multiprogramming, Multiprocessing, Multitasking, Multithreading** - *https://www.geeksforgeeks.org/operating-system-difference-multitasking-multithreading-multiprocessing/*
3. **System Call** - *https://www.geeksforgeeks.org/operating-system-introduction-system-call/*
4. **Process Management** - Process Control Block(PCB) - Process ID (PID), Process State, Program Counter, CPU Scheduling Info, CPU Registers 
  
   *https://www.geeksforgeeks.org/gate-notes-operating-system-process-management-introduction/*
   *https://www.geeksforgeeks.org/operating-system-process-table-process-control-block-pcb/*
   
5. **CPU Scheduling (Process Scheduling)** - 

   Process scheduler - 
   
                       Long term scheduler - New -> Ready transition, Job scheduler, controls degree of multi-programming
                       Short term scheduler - Ready -> Running selection, only selection, not transition, dispatcher handles transition
                       Medium term scheduler - suspending and resuming process, switching from main memory to secondary memory and vice-versa
   
   Dispatcher - 
        
                       handles transition from ready to running state (Context Switching)
                       https://www.geeksforgeeks.org/operating-system-difference-dispatcher-scheduler/
   
   Time variants related to a process - 
   
                       Arrival Time - Time when program arrives in Job Queue (Ready Queue)
                       Completion Time  - Time when process completes execution
                       Burst Time - Time duration of process execution at CPU (Process can be executed in multiple bursts)
                       Turn Around Time (TAT) - Completion Time - Arrival Time
                       Waiting Time - TAT - Burst Time
                       Service Time - Time at which process execution starts or is responded for the first time
                       
   CPU scheduling algorithms - Non-preemptive and Preemptive algorithms 
   
                       Non-preemptive algorithms - 
                          FCFS - Convoy effect - https://www.geeksforgeeks.org/convoy-effect-operating-systems/
                          Shortest Job First (SJF)
                          Non-preemptive priority scheduling
                       
                       Preemptive algorithms - 
                          Round Robin
                          SRTF (Shortest Remaining Time First) (Pre-emptive version of SJF)
                          Pre-emptive priority scheduling
                          Multi-level queue scheduling
                       
   Starvation -
   
                       Starvation - Indefinite wait
                       Deadlock - Infinite wait
                       Aging - solution to starvation (https://www.geeksforgeeks.org/starvation-aging-operating-systems/)
