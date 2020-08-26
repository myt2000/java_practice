package com.finaltest;

interface Network {
    public void browse();
}
// 被代理类
class RealServer implements Network {
    @Override
    //@Override是伪代码,表示重写。(当然不写@Override也可以)，不过写上有如下好处:
    //1、可以当注释用,方便阅读；
    //2、编译器可以给你验证@Override下面的方法名是否是你父类中所有的，如果没有则报错。
    // 例如，你如果没写@Override，而你下面的方法名又写错了，这时你的编译器是可以编译通过的，因为编译器以为这个方法是你的子类中自己增加的方法。
    public void browse() {
        System.out.println("真实服务器上网浏览信息");
    }
}

// 代理类
class ProxyServer implements Network {
    private Network network;
    public ProxyServer(Network network) {
        this.network = network;
    }
    public void check() {
        System.out.println("检查网络连接等操作");
    }
    public void browse() {
        check();
        network.browse();
    }
}
public class ProxyDemo {
    public static void main(String[] args) {
        Network net = new ProxyServer(new
                RealServer());
        net.browse();
    }
}
//检查网络连接等操作
//真实服务器上网浏览信息