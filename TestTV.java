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

    }
}


