package com.tejnal.java.tejnaljavalab.topics.builderPattern;

/**
 * @project tejnal-java-lab
 * @autor tejnal on 2020-05-07
 */
public class LunchBoxMenu {

    private final String bread;
    private final String meat;
    private final String salad;
    private final String dressing;

    public LunchBoxMenu(Builder builder){
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.salad = builder.salad;
        this.dressing = builder.dressing;


    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public String getSalad() {
        return salad;
    }

    public String getDressing() {
        return dressing;
    }


    public  static class Builder {

        private  String bread;
        private  String meat;
        private  String salad;
        private  String dressing;

        public Builder() {


        }

        public LunchBoxMenu build() {
            return new LunchBoxMenu(this);
        }


        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

        public Builder salad(String salad) {
            this.salad = salad;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }


    }
}
