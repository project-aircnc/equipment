package analysis;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Equipment_table")
public class Equipment {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Long requestId;
    private String equipStatus;

    @PostPersist
    public void onPostPersist(){
        EquipStatusUpdated equipStatusUpdated = new EquipStatusUpdated();
        BeanUtils.copyProperties(this, equipStatusUpdated);
        equipStatusUpdated.publishAfterCommit();


    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }
    public String getEquipStatus() {
        return equipStatus;
    }

    public void setEquipStatus(String equipStatus) {
        this.equipStatus = equipStatus;
    }




}
