package com.shinyhut.vernacular.client.rendering;

public enum ColorDepth {

    /** 8 bits per pixel indexed color **/
    BPP_8_INDEXED(8, 8, false, 0, 0, 0, 0, 0, 0),

    /** 8 bits per pixel true color **/
    // RGB332: red=3 bits (max 7, shift 5), green=3 bits (max 7, shift 2), blue=2 bits (max 3, shift 0)
    BPP_8_TRUE(8, 8, true, 7, 7, 3, 5, 2, 0),

    /** 16 bits per pixel true color **/
    // RGB565: red=5 bits (max 31, shift 11), green=6 bits (max 63, shift 5), blue=5 bits (max 31, shift 0)
    BPP_16_TRUE(16, 16, true, 31, 63, 31, 11, 5, 0),

    /** 24 bits per pixel true color **/
    // 24-bit depth (32 bpp transport): red shift 16, green shift 8, blue shift 0
    BPP_24_TRUE(32, 24, true, 255, 255, 255, 16, 8, 0);

    private final int bitsPerPixel;
    private final int depth;
    private final boolean trueColor;
    private final int redMax;
    private final int greenMax;
    private final int blueMax;
    private final int redShift;
    private final int greenShift;
    private final int blueShift;

    ColorDepth(int bitsPerPixel, int depth, boolean trueColor,
               int redMax, int greenMax, int blueMax,
               int redShift, int greenShift, int blueShift) {
        this.bitsPerPixel = bitsPerPixel;
        this.depth = depth;
        this.trueColor = trueColor;
        this.redMax = redMax;
        this.greenMax = greenMax;
        this.blueMax = blueMax;
        this.redShift = redShift;
        this.greenShift = greenShift;
        this.blueShift = blueShift;
    }

    public int getBitsPerPixel() {
        return bitsPerPixel;
    }

    public int getDepth() {
        return depth;
    }

    public boolean isTrueColor() {
        return trueColor;
    }

    public int getRedMax() {
        return redMax;
    }

    public int getGreenMax() {
        return greenMax;
    }

    public int getBlueMax() {
        return blueMax;
    }

    public int getRedShift() {
        return redShift;
    }

    public int getGreenShift() {
        return greenShift;
    }

    public int getBlueShift() {
        return blueShift;
    }
}
