package com.dong.westtwowork;

abstract class AbstractAnimal {
        protected String name;
        protected int age;
        protected String gender;
        protected double price;

        public AbstractAnimal() {}

        public AbstractAnimal(String name, int age, String gender, double price) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.price = price;
        }

        /**
         * 获取
         * @return name
         */
        public String getName() {

            return name;
        }

        /**
         * 设置
         * @param name
         */
        public void setName(String name) {

            this.name = name;
        }

        /**
         * 获取
         * @return age
         */
        public int getAge() {

            return age;
        }

        /**
         * 设置
         * @param age
         */
        public void setAge(int age) {

            this.age = age;
        }

        /**
         * 获取
         * @return gender
         */
        public String getGender() {

            return gender;
        }

        /**
         * 设置
         * @param gender
         */
        public void setGender(String gender) {

            this.gender = gender;
        }

        /**
         * 获取
         * @return price
         */
        public double getPrice() {

            return price;
        }

        /**
         * 设置
         * @param price
         */
        public void setPrice(double price) {

            this.price = price;
        }

        public abstract String toString();

    }


