package com.cryptek.playground;

public value record InlinePojo(int[] val1, int[] val2, int[] val3) {
  void add() {
    for(int i=0; i < val3.length; i++) {
      val3[i] = val1[i] + val2[i];
    }
  }}
