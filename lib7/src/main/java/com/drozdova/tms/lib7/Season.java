package com.drozdova.tms.lib7;

// task 1
public enum Season {
    AUTUMN(5),
    WINTER(-15),
    SPRING(10),
    SUMMER(25) {
        // task 6
        @Override
        public String getDescription() {
            return "Warm season...";
        }
    };
    // task 4
    private int averageTemp;
    // task 5
    Season(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    // task 6
    public String getDescription() {
        return "Cold season...";
    }
}