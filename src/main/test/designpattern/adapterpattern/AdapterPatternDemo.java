package main.test.designpattern.adapterpattern;

import main.java.designpattern.adapterpattern.service.impl.AudioPlayer;

/**
 * 适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。
 * 这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能。
 *
 * 应用实例：
 *       1、美国电器 110V，中国 220V，就要有一个适配器将 110V 转化为 220V。
 *       2、在 LINUX 上运行 WINDOWS 程序。
 *       3、JAVA 中的 jdbc
 */
public class AdapterPatternDemo {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();
 
      audioPlayer.play("mp3", "beyond the horizon.mp3");
      audioPlayer.play("mp4", "alone.mp4");
      audioPlayer.play("vlc", "far far away.vlc");
      audioPlayer.play("avi", "mind me.avi");
   }
}
