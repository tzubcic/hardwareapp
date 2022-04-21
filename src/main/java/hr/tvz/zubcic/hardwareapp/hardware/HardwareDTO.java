package hr.tvz.zubcic.hardwareapp.hardware;

import java.math.BigDecimal;

public class HardwareDTO {

    private final String code;
    private final String name;
    private final BigDecimal price;
    private final Hardware.Type type;
    private final Integer quantityAvailable;

    public HardwareDTO(String code, String name, BigDecimal price, Hardware.Type type, Integer quantityAvailable) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.type = type;
        this.quantityAvailable = quantityAvailable;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Hardware.Type getType() {
        return type;
    }

    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    @Override
    public String toString() {
        return "HardwareDTO{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type +
                ", quantityAvailable=" + quantityAvailable +
                '}';
    }
}
