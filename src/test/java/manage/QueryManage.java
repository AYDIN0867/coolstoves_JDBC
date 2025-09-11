package manage;


import lombok.Getter;

@Getter
public class QueryManage {

    private final String depositeSelectQuery="SELECT DISTINCT user_id FROM deposits WHERE amount BETWEEN 100 AND 500";

    //artık bizim query mize kimse ulaşamayacak çünkü private kendimizi görmesi için GETTER VE SETTER kullaacağız...getter
    //loombook dan geliyor...
}