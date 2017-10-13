package sqlite.edu.nguyenmy.lesson4_permisson.widget;

/**
 * Created by DELL on 10/13/2017.
 */

public class ItemView {
    private String mName;
    private int mImg;

    public ItemView(String mName, int mImg) {
        this.mName = mName;
        this.mImg = mImg;
    }

    public String getmName() {
        return mName;
    }

    public int getmImg() {
        return mImg;
    }
}
