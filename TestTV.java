package bisdi.pertemuan05;

public class TestTV {
    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        System.out.println("TV 1's channel is "+tv1.channel+" and volume level is "+tv1.volumeLevel);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        System.out.println("TV 2's channel is "+tv2.channel+" and volume level is "+tv2.volumeLevel);

        TV tv3 = new TV();
        tv3.turnOn();
        tv3.setChannel(60);
        tv3.channelUp();   //61
        tv3.channelUp();   //62

        tv3.channelDown(); //61
        tv3.channelDown(); //60
        tv3.channelDown(); //59
        tv3.channelDown(); //58

        tv3.volumeUp();  //2
        tv3.volumeUp();  //3
        tv3.volumeUp(); //4
        tv3.volumeUp(); //5
        System.out.println("TV 3's channel is "+tv3.channel+" and volume level is "+tv3.volumeLevel);

        tv3.turnOff();
        tv3.channelDown(); //57
        tv3.channelDown(); //56
        tv3.channelDown(); //55
        System.out.println("TV 3's channel after turned off is "+tv3.channel+" and volume level is "+tv3.volumeLevel);




    }
}


