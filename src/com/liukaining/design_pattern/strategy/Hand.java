package com.liukaining.design_pattern.strategy;

public class Hand {
    public static final int HAND_VALUE_GUU = 0;
    public static final int HAND_VALUE_CHO = 1;
    public static final int HAND_VALUE_PAA = 2;

    public static final Hand[] hand = {
            new Hand(HAND_VALUE_GUU),
            new Hand(HAND_VALUE_CHO),
            new Hand(HAND_VALUE_PAA),
    };

    private int handValue;

    private Hand(int handValue) {
        this.handValue = handValue;
    }

    private static final String[] name = {
            "石头", "剪刀", "布",
    };

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand hand) {
        return fight(hand) == 1;
    }

    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    /**
     *
     * @param hand
     * @return
     */
    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.handValue + 1) % 3 == hand.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     *
     * @return
     */
    public String toString(){
        return name[handValue];
    }

}
