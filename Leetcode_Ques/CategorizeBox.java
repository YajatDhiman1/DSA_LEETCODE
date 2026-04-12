class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {

        boolean isBulky = false;

        if (length >= 10000 || width >= 10000 || height >= 10000) {
            isBulky = true;
        }

        long vol = 1L * length * width * height;
        if (vol >= 1_000_000_000L) {
            isBulky = true;
        }

        boolean isHeavy = mass >= 100;

        if (isBulky && isHeavy) {
            return "Both";
        } else if (isBulky) {
            return "Bulky";
        } else if (isHeavy) {
            return "Heavy";
        } else {
            return "Neither";
        }
    }
}