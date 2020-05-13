package analysis;

public class EquipStatusUpdated extends AbstractEvent {

    private Long id;
    private Long requestId;
    private String equipStatus;

    public EquipStatusUpdated(){
        super();
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
