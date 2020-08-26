package com.finaltest;

class Ticket implements Runnable {
//    private int tick = 100;
//    public void run() {
//        while (true) {
//            if (tick > 0) {
//                System.out.println(Thread.currentThread().getName() + "售出车票，tick号为：" + tick--);
//            } else
//                break;
//        }
//    }
    private int tick = 100;
        public void run(){
            while(true){
                if(tick>0){
                    try{
                        Thread.sleep(10);
                    }catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"售出车票，tick号为： "+tick--);
                }
            }
        }
}
class TicketDemo {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.setName("t1窗口");
        t2.setName("t2窗口");
        t3.setName("t3窗口");
        t1.start();
        t2.start();
        t3.start();
    }
}
//t2窗口售出车票，tick号为：100
//t2窗口售出车票，tick号为：99
//t2窗口售出车票，tick号为：98
//t2窗口售出车票，tick号为：97
//t2窗口售出车票，tick号为：95
//t2窗口售出车票，tick号为：94
//t2窗口售出车票，tick号为：93
//t2窗口售出车票，tick号为：92
//t2窗口售出车票，tick号为：91
//t2窗口售出车票，tick号为：90
//t2窗口售出车票，tick号为：89
//t2窗口售出车票，tick号为：88
//t2窗口售出车票，tick号为：87
//t2窗口售出车票，tick号为：86
//t2窗口售出车票，tick号为：85
//t2窗口售出车票，tick号为：84
//t2窗口售出车票，tick号为：83
//t1窗口售出车票，tick号为：96
//t1窗口售出车票，tick号为：81
//t2窗口售出车票，tick号为：82
//t1窗口售出车票，tick号为：80
//t2窗口售出车票，tick号为：79
//t1窗口售出车票，tick号为：78
//t1窗口售出车票，tick号为：76
//t1窗口售出车票，tick号为：75
//t1窗口售出车票，tick号为：73
//t1窗口售出车票，tick号为：72
//t1窗口售出车票，tick号为：71
//t1窗口售出车票，tick号为：70
//t1窗口售出车票，tick号为：69
//t1窗口售出车票，tick号为：68
//t1窗口售出车票，tick号为：67
//t1窗口售出车票，tick号为：66
//t1窗口售出车票，tick号为：65
//t1窗口售出车票，tick号为：64
//t1窗口售出车票，tick号为：63
//t1窗口售出车票，tick号为：62
//t1窗口售出车票，tick号为：61
//t1窗口售出车票，tick号为：60
//t1窗口售出车票，tick号为：59
//t1窗口售出车票，tick号为：58
//t1窗口售出车票，tick号为：57
//t1窗口售出车票，tick号为：56
//t1窗口售出车票，tick号为：55
//t1窗口售出车票，tick号为：54
//t1窗口售出车票，tick号为：53
//t1窗口售出车票，tick号为：52
//t1窗口售出车票，tick号为：51
//t1窗口售出车票，tick号为：50
//t1窗口售出车票，tick号为：49
//t1窗口售出车票，tick号为：48
//t1窗口售出车票，tick号为：47
//t1窗口售出车票，tick号为：46
//t2窗口售出车票，tick号为：77
//t2窗口售出车票，tick号为：44
//t1窗口售出车票，tick号为：45
//t1窗口售出车票，tick号为：42
//t3窗口售出车票，tick号为：74
//t3窗口售出车票，tick号为：40
//t3窗口售出车票，tick号为：39
//t3窗口售出车票，tick号为：38
//t1窗口售出车票，tick号为：41
//t1窗口售出车票，tick号为：36
//t1窗口售出车票，tick号为：35
//t1窗口售出车票，tick号为：34
//t1窗口售出车票，tick号为：33
//t1窗口售出车票，tick号为：32
//t1窗口售出车票，tick号为：31
//t1窗口售出车票，tick号为：30
//t1窗口售出车票，tick号为：29
//t1窗口售出车票，tick号为：28
//t1窗口售出车票，tick号为：27
//t1窗口售出车票，tick号为：26
//t1窗口售出车票，tick号为：25
//t1窗口售出车票，tick号为：24
//t1窗口售出车票，tick号为：23
//t1窗口售出车票，tick号为：22
//t1窗口售出车票，tick号为：21
//t1窗口售出车票，tick号为：20
//t1窗口售出车票，tick号为：19
//t2窗口售出车票，tick号为：43
//t2窗口售出车票，tick号为：17
//t2窗口售出车票，tick号为：16
//t2窗口售出车票，tick号为：15
//t1窗口售出车票，tick号为：18
//t3窗口售出车票，tick号为：37
//t3窗口售出车票，tick号为：12
//t3窗口售出车票，tick号为：11
//t3窗口售出车票，tick号为：10
//t1窗口售出车票，tick号为：13
//t1窗口售出车票，tick号为：8
//t2窗口售出车票，tick号为：14
//t2窗口售出车票，tick号为：6
//t2窗口售出车票，tick号为：5
//t2窗口售出车票，tick号为：4
//t2窗口售出车票，tick号为：3
//t2窗口售出车票，tick号为：2
//t2窗口售出车票，tick号为：1
//t1窗口售出车票，tick号为：7
//t3窗口售出车票，tick号为：9