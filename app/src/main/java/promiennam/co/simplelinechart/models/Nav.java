package promiennam.co.simplelinechart.models;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by Phuong on 13-May-17.
 */

@IgnoreExtraProperties
public class Nav{

    private String date;
    private float amount;

    public Nav() {
    }

    public Nav(String date, float amount) {
        this.date = date;
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
}
