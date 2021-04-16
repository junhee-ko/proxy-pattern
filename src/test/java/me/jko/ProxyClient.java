package me.jko;

import org.junit.jupiter.api.Test;

public class ProxyClient {

  @Test
  void test() {
    Image image01 = new ProxyImage("image01");
    Image image02 = new ProxyImage("image02");

    image01.displayImage();
    image02.displayImage();
  }
}
