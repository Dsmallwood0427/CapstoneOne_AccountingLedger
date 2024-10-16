package com.pluralsight;

public class Transaction {

    // properties
    private String date;
    private String time;
    private String description;
    private String vendor;
    private float amount;

    // constructor
    public Transaction(String date, String time, String description, String vendor, float amount) {
        this.date = date;
        this.time = time;
        this.description = description;
        this.vendor = vendor;
        this.amount = amount;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;

        public String getDateOfTransactiom () {
            return getDateOfTransactiom();
        }

        public void setDateOfTransaction (String dateOfTransaction){
            this.dateOfTransaction = dateOfTransaction;
        }

        public String getTimeOfTansaction () {
            return timeOfTransaction;
        }

        public void setTimeOfTransaction (String timeOfTransaction){
            this.timeOfTransaction = timeOfTransaction;
        }

        public String getAmountOfTransaction () {
            return AmountOfTransaction;
        }

        public void setAmountOfTransaction (String timeOfTransaction){
            this.amountOfTransaction = amountOfTransaction;
        }

        @Override
        public String toString () {
            return "Transaction{" +
                    "date='" + date + '\'' +
                    ", description='" + description + '\'' +
                    ", vendor=" + vendor +
                    ", amount='" + amount + '\'' +
                    ", dateOfTransaction='" + dateOfTransaction + '\'' +
                    ", timeOfTransactions='" + timeOfTransaction + '\'' +
                    ", amountOfTransactions='" + amountOfTransaction + '\'' +
                    '}';
        }
    }












}
