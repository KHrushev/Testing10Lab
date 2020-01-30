package com.hrushev;

public class Filter {

    public float[] filter(float[] initial) {
        float[] result = new float[initial.length];

        for (int i = 0; i < result.length; i++) {
            float sum = 0;

            for (int j = i; j < result.length; j++) {
                sum += initial[j];
            }

            result[i] = sum/(result.length-i);
        }

        return result;
    }

}
