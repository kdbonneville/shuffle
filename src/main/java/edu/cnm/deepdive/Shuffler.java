package edu.cnm.deepdive;

import java.util.Random;

public class Shuffler {

  private final Random rng;

  public Shuffler(Random rng) {
    this.rng = rng;
  }

  public void shuffle(int[] data) {
    for (int targetIndex = data.length - 1; targetIndex > 0; targetIndex--) {
      int sourceIndex = rng.nextInt(targetIndex + 1);
      int temp = data[targetIndex];
      data[targetIndex] = data[sourceIndex];
      data[sourceIndex] = temp;
    }
  }

  public void shuffle(byte[] data) {
    for (int targetIndex = data.length - 1; targetIndex > 0; targetIndex--) {
      int sourceIndex = rng.nextInt(targetIndex + 1);
      byte temp = data[targetIndex];
      data[targetIndex] = data[sourceIndex];
      data[sourceIndex] = temp;
    }
  }

  public void shuffle(Object[] data) {
    for (int targetIndex = data.length - 1; targetIndex > 0; targetIndex--) {
      int sourceIndex = rng.nextInt(targetIndex + 1);
      Object temp = data[targetIndex];
      data[targetIndex] = data[sourceIndex];
      data[sourceIndex] = temp;
    }
  }

  public void shuffle(short[] data) {
    for (int targetIndex = data.length - 1; targetIndex > 0; targetIndex--) {
      int sourceIndex = rng.nextInt(targetIndex + 1);
      short temp = data[targetIndex];
      data[targetIndex] = data[sourceIndex];
      data[sourceIndex] = temp;
    }
  }

  public void shuffle(char[] data) {
    for (int targetIndex = data.length - 1; targetIndex > 0; targetIndex--) {
      int sourceIndex = rng.nextInt(targetIndex + 1);
      char temp = data[targetIndex];
      data[targetIndex] = data[sourceIndex];
      data[sourceIndex] = temp;
    }
  }

  public void shuffle(long[] data) {
    for (int targetIndex = data.length - 1; targetIndex > 0; targetIndex--) {
      int sourceIndex = rng.nextInt(targetIndex + 1);
      long temp = data[targetIndex];
      data[targetIndex] = data[sourceIndex];
      data[sourceIndex] = temp;
    }
  }

  public void shuffle(float[] data) {
    for (int targetIndex = data.length - 1; targetIndex > 0; targetIndex--) {
      int sourceIndex = rng.nextInt(targetIndex + 1);
      float temp = data[targetIndex];
      data[targetIndex] = data[sourceIndex];
      data[sourceIndex] = temp;
    }
  }

  public void shuffle(double[] data) {
    for (int targetIndex = data.length - 1; targetIndex > 0; targetIndex--) {
      int sourceIndex = rng.nextInt(targetIndex + 1);
      double temp = data[targetIndex];
      data[targetIndex] = data[sourceIndex];
      data[sourceIndex] = temp;
    }
  }

  public void shuffle(boolean[] data) {
    for (int targetIndex = data.length - 1; targetIndex > 0; targetIndex--) {
      int sourceIndex = rng.nextInt(targetIndex + 1);
      boolean temp = data[targetIndex];
      data[targetIndex] = data[sourceIndex];
      data[sourceIndex] = temp;
    }
  }
}





