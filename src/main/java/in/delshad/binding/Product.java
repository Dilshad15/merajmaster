package in.delshad.binding;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* for json format a normal java class will ok coz spring taking care of json to java 
   and java to json conversion but for xml type we need to specify the java class as
   binding class so to represent java class as binding we use @XmlRootElement Annotation 
*/
@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
private Integer pId;
private String pName;
private Double price;
}
