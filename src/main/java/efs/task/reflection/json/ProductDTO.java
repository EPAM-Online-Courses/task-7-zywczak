package efs.task.reflection.json;


import java.math.BigDecimal;
import java.util.Date;

/**
 * TODO: Użyj tu odpowiednich adnotacji z biblioteki Jackson
 */
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({ "ProductID", "ProductName", "ProductPrice", "DateOfProduction", "DateOfExpiry" })
public class ProductDTO {
    @JsonProperty("ProductID")
    private Long id;
    
    @JsonProperty("ProductName")
    private String name;
    
    @JsonProperty("ProductPrice")
    private BigDecimal price;

    @JsonProperty("DateOfProduction")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date expiryDate;

    @JsonProperty("DateOfExpiry")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date productionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productionDate=" + productionDate +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
