package spitter.web;

import com.sun.istack.internal.NotNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;


/**
 * @Discription:
 * @Author: allen
 * @Date: 2017/7/20
 */
public class SpittleForm {

    @NotNull
    @Size(min=1,max=140)
    private String message;

    @Min(-180)
    @Max(180)
    private Double longtitude;

    @Min(-90)
    @Max(90)
    private Double latitude;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Double getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(Double longtitude) {
        this.longtitude = longtitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
